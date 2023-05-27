package StringAndStringBuilder;

public class StringBuilderAndStringEqualsCompare {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Java");
    String s = "Java";
    if(sb.toString().equals(s)){
      System.out.println("Match 1");
    }
    if (s.equals(sb)){
      System.out.println();
    } // validar todos los posibles casos
    if(sb.equals(s)){
      System.out.println();
    }
  }
}
