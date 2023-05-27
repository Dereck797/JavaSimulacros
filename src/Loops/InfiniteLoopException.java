package Loops;

public class InfiniteLoopException {
  public static void main(String[] args) {
    int b = 10;
    int a = 0;
    int result = 0;
    try {
      while (true){
        result = b/ a;
      }
    } catch (RuntimeException e){
      System.out.println("La buena");
    } catch (Exception e){
      System.out.println("La buena 2");
    }
    System.out.println("La buena 3");
  }
}
