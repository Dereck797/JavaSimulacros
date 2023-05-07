package Dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {
  public static void main(String [] args) {
    LocalDate date = LocalDate.of(2012, 1, 11);
    Period period = Period.ofMonths(2);
    // En este caso mm representa minutos y no meses, para representar meses es necesario representarlo con MM
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
    System.out.print(formatter.format(date.minus(period)));
  }
}
