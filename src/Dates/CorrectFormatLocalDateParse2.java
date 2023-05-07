package Dates;

import java.time.LocalDate;

public class CorrectFormatLocalDateParse2 {
  public static void main(String [] args) {
    // Esto genera un error en tiempo de ejecución debido que debería ser "2018-01-01" en vez de "2018-1-01"
    LocalDate date = LocalDate.parse("2018-1-01");
    System.out.println(date);
  }
}
