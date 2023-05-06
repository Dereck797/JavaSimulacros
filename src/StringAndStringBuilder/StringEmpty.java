package StringAndStringBuilder;

// What will be the result of compiling and executing Test class?

public class StringEmpty {
  public static void main(String[] args) {
    String str1 = " ";
    boolean b1 = str1.isEmpty();
    System.out.println(b1);
    // A pesar de que en esta línea se realice un.trim hay que tener en cuenta de que str1.trim() no está siendo asignado a ninguna otra cadena.
    // Por lo tanto esta no es mutable.
    str1.trim();
    b1 = str1.isEmpty();
    System.out.println(b1);
  }
}
