package Dates;

import java.time.LocalDate;
import java.time.Period;

public class MininumLocalDate {
  public static void main(String [] args) {
    // LocalDate va desde un rango {-999999999-01-01} hasta {+999999999-12-31}
    LocalDate date = LocalDate.parse("2000-01-01");
    Period period = Period.ofYears(-3000);
    // En este caso el resultado es "-1000-01-01"
    System.out.println(date.plus(period));
  }
}
