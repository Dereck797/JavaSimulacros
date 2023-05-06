package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

class Student_1 {
  private String name;
  private int age;

  Student_1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Student[" + name + ", " + age + "]";
  }

  public boolean equals(Object obj) {
    if(obj instanceof Student_1) {
      Student_1 stud = (Student_1)obj;
      if(this.name.equals(stud.name) && this.age == stud.age) {
        return true;
      }
    }
    return false;
  }
}

public class ListRemove2 {
  public static void main(String[] args) {
    List<Student_1> students = new ArrayList<>();
    students.add(new Student_1("James", 25));
    students.add(new Student_1("James", 27));
    students.add(new Student_1("James", 25));
    students.add(new Student_1("James", 25));

    students.remove(new Student_1("James", 25));

    for(Student_1 stud : students) {
      System.out.println(stud);
    }
  }
}