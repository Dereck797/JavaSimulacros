package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
  public abstract void m1() throws IOException;
}

class Sub extends Super {
  @Override
  public void m1() throws IOException {
    throw new FileNotFoundException();
  }
}

public class Test {
  public static void main(String[] args) {
    Super s = new Sub();
    try {
      s.m1();
    } catch (IOException e) {
      System.out.print("A");
    } /*catch(FileNotFoundException e) {  // Es importante aclarar que cuando se implementan excepciones, primero deben o ser la excepción que se debe implementar
      System.out.print("B");            // o una sublcase de esta, y en este caso eso está bien, sin embargo el orden en el que se implementan debe ser, primero las
    }*/ finally {                         // subclases y mas abajo las superclases de excepciones.
      System.out.print("C");
    }
  }
}