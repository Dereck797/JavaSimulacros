package StringAndStringBuilder;

public class StringBuilderDelete {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
    // El método delete de la clase StrinBuilder solo genera excepción cuando suceden los siguientes casos,
    // - El primer parámetro es negativo
    // - El primer parámetro es mayor a sb.length()
    // - El primer parámetro es mayor que el segundo parámetro

    // - En este caso, sb.delete(0, 100); es equivalente a sb.delete(0,sb.length());
    sb.delete(0, 100);
    System.out.println(sb.length());
    System.out.println(sb);
  }
}
