package StringAndStringBuilder;

import java.sql.SQLOutput;

public class StringEquals_2 {
  public static void main(String[] args) {
    String name1 = "Dereck";
    String name2 = "Muñoz";
    String name3 = "Dereck";
    String name4 = "Muñoz";
    // El pool de cadenas solo se hace presente cuando la asignación a otra cadena se realiza en tiempo de compilación.
    String name_1 = name1 + name2;
    String name_2 = name3 + name4;
    String name_3 = new String("Dereck") + new String("Muñoz");
    String name_4 = new String("Dereck") + new String("Muñoz");
    // En el siguiente caso retornará falso debido a que el == compara referencia de objetos y no poseen la misma referencia debido
    // a que los valores que se le asignan son calculados en tiempo de ejecución, por lo tanto es posible que puedan ser mutados.
    System.out.println(name_1 == name_2);
    // En el siguiente caso también retornará falso debido a que el constructor de String se llama o se ejecuta en tiempo de ejecución.
    System.out.println(name_3 == name_4);
  }
}
