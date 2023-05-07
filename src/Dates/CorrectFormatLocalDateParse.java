package Dates;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CorrectFormatLocalDateParse {
  public static void main(String[] args) {
    List<LocalDate> dates = new ArrayList<>();
    // el método LocalDate.parse() recibe un parámetro de tipo texto, sin embargo lo debe recibir en un formato especifico
    // en este caso se recibe "2018-7-11" lo cuál es incorrecto y debería ser 2018-07-11. Lo mismo que si fuera por ejemplo "2018-1-1" el formato debería ser
    // "2018-01-01" de no ser así se genera un error en tiempo de ejecución.
    dates.add(LocalDate.parse("2018-7-11"));
    dates.add(LocalDate.parse("1919-10-25"));
    dates.add(LocalDate.of(2020, 4, 8));
    dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

    dates.removeIf(x -> x.getYear() < 2000);

    System.out.println(dates);
  }
}
