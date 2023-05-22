package StringAndStringBuilder;

public class StringConcatWithWrapperTypeEquals {
  public static void main(String[] args) {
    final int i1 = 1;
    final Integer i2 = 1;      // Aunque i2 sea de tipo final, no se define su valor en tiempo de compilación sino en tiempo de ejecución, debido a que como se comporta
    final String s1 = ":ONE";  // como un objeto, aún no sexiste una instancia en memoria ni alguna posición o referencia. Por lo tanto todas las variables que son de tipo
                               // Wrapper se definen en tiempo de ejecución y no en tiempo de compilación y por ende no entrarían a ser parte del pool de strings.
                               // en cambio todos los tipos de variables primitivios si pueden entrar en el pool de string debido a que su valor es conocido en tiempo de compilación

    String str1 = i1 + s1;
    String str2 = i2 + s1;

    System.out.println(str1 == "1:ONE");
    System.out.println(str2 == "1:ONE");
  }
}
