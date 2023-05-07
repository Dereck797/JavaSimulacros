package Predicates;

import java.util.function.Predicate;

  /*
  Which of the following options can replace "INSERT" such that on executing
  Test class all the array elements are displayed in the output? Select ALL that apply.


  - p -> true
  - p -> p.length() < 10
  - p -> !false
  - p -> p.length() >= 1

  */

// En este caso todas las opciones son correctas debido a que todas retornan true al evaluarsen

public class Predicate1 {
  public static void main(String[] args) {
    String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

    processStringArray(arr, p -> true/*INSERT*/);
  }

  private static void processStringArray(String [] arr, Predicate<String> predicate) {
    for(String str : arr) {
      if(predicate.test(str)) {
        System.out.println(str);
      }
    }
  }
}
