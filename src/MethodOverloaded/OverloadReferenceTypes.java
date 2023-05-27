package MethodOverloaded;

public class OverloadReferenceTypes {
  private static void add(int i, int j) {
    System.out.println("int version");
  }

  private static void add(Integer i, Integer j) {
    System.out.println("Integer version");
  }

  public static void main(String[] args) {
    add(10, 20);
  }
}
