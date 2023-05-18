package DataTypes;

public class TypeByteParse {
  public static void main(String[] args) {
/*    byte e = 5;
    byte f = 10;

    // Cuando en Java se realiza una operación aritmética se convierten los tipos a int o a long. Por eso en este caso es necesaria la conversión explicitas de la suma de bytes
    // Sin la conversión explícita solo podría ser asignable a int, double, long o float
    byte y = (byte)(e + f);*/

    boolean x = true, z = true;
    int y = 20;
    x = (y != 10) ^ (z=false);
    System.out.println(x+", "+y+", "+z);
  }
}
