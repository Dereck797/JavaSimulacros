package MethodOverloaded;

public class OverloadedReferenceTypes {
  public static void main(String[] args) {
    m1(new Integer(1), 3);
  }

  static void m1(Object s) {
    System.out.println("Object");
  }

  static void m1(CharSequence s) {
    System.out.println("CharSequence");
  }


  static void m1(int s, double d) {
    System.out.println("CharSequence");
  }

  static void m1(int s, long d) {
    System.out.println("CharSequence");
  }

  static void m1(Integer s, Long d) {
    System.out.println("CharSequence");
  }

  static void m1(Integer s, long d) {
    System.out.println("CharSequence");
  }

  static void m1(Integer s, Double d) {
    System.out.println("CharSequence");
  }
}
