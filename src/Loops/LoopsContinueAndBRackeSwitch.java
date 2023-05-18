package Loops;

public class LoopsContinueAndBRackeSwitch {


  // Se debe tener especial cuidado con la etiqueta break, esta etiqueta nos saca del scope actual en un nivel y no en el nivel completo
  // También se debe tener especial cuidado en los switch case porque si por ejemplo el primer caso se cumple y no lleva un break, se ejecutará la
  // sentencia definida dentro del siguiente caso aunque este no se cumpla.
  public static void main(String[] args) {
    String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
    for (int i = 0; i < arr.length; i++) { //Line n1
      for (int j = 0; j < arr[i].length; j++) { //Line n2
        switch (arr[i][j]) { //Line n3
          case "2":
            System.out.println(" : " + " 2 ");
          case "4":
            System.out.println(" : " + " 4 ");
          case "6":
            System.out.println(" : " + " 6 ");
            break; //Line n4
          default:
            continue; //Line n5
        }
        System.out.print(arr[i][j]); //Line n6
      }
    }
  }

}
