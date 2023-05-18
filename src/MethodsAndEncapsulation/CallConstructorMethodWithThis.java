package MethodsAndEncapsulation;

class Student {
  String name;
  int age;

  Student() {
    // Student("James", 25); // En este caso se genera un error de compilación porque el llamado a otro constructor de la clase se debe realizar con this() y la firma del método
    // del siguiente modo.
    this("James",25);
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class CallConstructorMethodWithThis {
  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name + ":" + s.age);
  }
}
