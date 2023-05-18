package Inheritance;

class A { }

class B extends A {}

public class BasicInheritance {
  public static void main(String[] args) {
    // B a = new B();
    // A a = new A();
    // B b = new A();
    A a = new B(); // En herencia siempre un padre podrá guardar la referencia de una clase hija, sin embargo un clase hija nunca podrá guardar la referencia de una clase padre
                   // a no ser que se realice un casteo como en el caso de B b = new A(); Debería de quedar B b = new (B) A();
  }
}
