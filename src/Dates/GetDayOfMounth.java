package Dates;

import java.time.LocalDate;

public class GetDayOfMounth {
  public static void main(String [] args) {
    LocalDate date = LocalDate.parse("2000-06-25");
    while(date.getDayOfMonth() >= 20) {
      System.out.println(date);
      // es importante tener en cuenta que date no es un objeto mutable como por ejemplo stringbuilder
      // por ende, al ejecutar date.plusDays(-1) se crea una nueva referencia pero esta no es asignada a ningún objeto nuevo de tipo LocalDate
      // esto a su vez no cambia el objeto date, sino que permanece siempre igual y por lo tanto se genera un loop infinito
      date.plusDays(-1);
    }
  }
}
