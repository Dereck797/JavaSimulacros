package SwitchCases;

public class SwitchCaseIntoWhile {
  public static void main(String[] args) {
    String[] arr = {"ar", "er", "or", "ir"};
    int a = 0;
    for (String e: arr) {
      switch (e){
        case "ir":
        case "er":
          a-=1;
          break;
        case "or":
          a-=1;
          break;
        case "ar":
          a+=2;
          break;
      }
    }
    System.out.println(a);
  }
}
