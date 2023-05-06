package MethodOverloaded;

/*

What will be the result of compiling and executing Test class?

- CharSequence
- Object
- String
- CompilationError

*/


public class OverloadedNullParameter {
  public static void main(String[] args) {
    m1(null);
  }

  static void m1(Object s) {
    System.out.println("Object");
  }

  static void m1(CharSequence s) {
    System.out.println("CharSequence");
  }

  /*
  En este caso se utiliza el método String debido a que es el más especifico, Esto quiere decir que es el que más abajo está en el nivel
  de herencia debido a que CharSequence hereda de Object y String, StringBuilder y StringBuffer heredan los 3 de de CharSequence, en ese orden
  de ideas si se agrega otro método sobrecargado con StringBuilder o StringBuffer
  */
  static void m1(String s) {
    System.out.println("String");
  }

}
