package Encapsulation.EncapsulationDifferentPackage.package2;

import Encapsulation.EncapsulationDifferentPackage.package1.A;

public class ExampleAccess {
  public static void main(String[] args) {
    A obj = new A(); //Line 7
    System.out.println(obj.i1); //Line 8
    // System.out.println(obj.i2); //Line 9, no puede ser accedida debido a que una variable de tipo protected solo puede ser accedida por medio de la herencia
    // System.out.println(obj.i3); //Line 10, no puede ser accedida debido a que una variable por default solo es publica para clases del mismo paquete
    // System.out.println(obj.i4); //Line 11, no puede ser accedida debido a que una variable de tipo private no puede ser accedida directamente.
  }
}
