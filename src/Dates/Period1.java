package Dates;

import java.time.Period;

public class Period1 {
  public static void main(String [] args) {
    // los métodos ofYears,ofMonths y ofDays. Cuando se ejecutan, no adicionan ayos meses o días respectivamente. Sino que remplazan el valor anterior.
    // en este caso period queda con la ultima asignación que sería ofDays(2). Para sumar porejemplo un año. Se debe agregar plusYears
    Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
    System.out.println(period);
  }
}
