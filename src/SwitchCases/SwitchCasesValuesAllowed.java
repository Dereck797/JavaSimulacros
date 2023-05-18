package SwitchCases;

/*For the class Test, which options, if used to replace *//*INSERT*//*, will print TEN on to the console? Select 4 options.*/

/*
- long var = 10; // Los switch cases no permiten valores long
- bye var = 10;
- Integer var = 10;
- Short var = 10;
- char var = 10;
- double var = 10; // Los switch cases no permiten valores double, tampoco float, tampoco long o boolean
*/

public class SwitchCasesValuesAllowed {
  public static void main(String[] args) {
    Integer var = 10;
    switch(var) {
      case 10:
        System.out.println("TEN");
        break;
      default:
        System.out.println("DEFAULT");
    }
  }
}
