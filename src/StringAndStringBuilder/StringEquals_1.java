package StringAndStringBuilder;


 // Consider below code:
public class StringEquals_1 {
   // Se debe tener en cuenta en qué momento se evaluan cada una de las cadenas, se pueden evaluar en tiempo de ejecución y en tiempo de compilación
   // En tiempo de compilación, si yo asigno a un string dos cadenas de la siguiente manera, la asignación se realiza en tiempo de compilación.
   // Debido a que esas cadenas no cambiaran en tiempo de ejecución debido a que se definen así: String cadena = "Hello" + "World"; Tanto Hello como World
   // No podrán tener ningún cambio durante la ejecución. Del mismo modo si yo tengo una cadena definida como final, tampoco tendrá ningún cambio en ejecución
   // Por lo tanto también se puede definir en tiempo de compilación.
  public static void main(String[] args) {
    final String fName = "James";
    String lName = "Gosling";
    String name1 = fName + lName;
    String name2 = fName + "Gosling";
    String name3 = "James" + "Gosling";
    System.out.println(name1 == name2);
    System.out.println(name2 == name3);
  }

  // El pool de cadenas solo se hace presente cuando la asignación a otra cadena se realiza en tiempo de compilación.

  // What will be the result of compiling and executing Test class ?
   /*
   false
   false

   false
   true

   true
   true

   true
   false
   */
}
