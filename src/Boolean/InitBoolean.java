package Boolean;

public class InitBoolean {
  public static void main(String[] args) {
    Boolean b1 = new Boolean("tRuE");
    Boolean b2 = new Boolean("fAlSe");
    Boolean b3 = new Boolean("abc");
    Boolean b4 = new Boolean(null);
    Boolean b5 = Boolean.valueOf("abc");
    Boolean b6 = new Boolean(false);
    Boolean b7 = Boolean.valueOf(null);
    Boolean b11 = Boolean.valueOf(false);
    Boolean b8 = Boolean.valueOf(true);
    Boolean b9 = Boolean.valueOf("true");
    Boolean b10 = Boolean.valueOf("TRUe");

    // El valueOf al permite que todas las variables a las que se asignan queden con la misma referencia

    System.out.println(b1);
  }
}
