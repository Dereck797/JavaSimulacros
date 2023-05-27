package MethodsAndEncapsulation;

class Student_ {
  String name;
  int age;

  Student_() {
    Student_("James", 25);
  }

  void Student_(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class RefactorClassThisOrVoid {

  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name + ":" + s.age);
  }

}
