package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListContains {
  public static void main(String[] args) {
    List<StringBuilder> days = new ArrayList<>();
    days.add(new StringBuilder("Sunday"));
    days.add(new StringBuilder("Monday"));
    days.add(new StringBuilder("Tuesday"));
    // No logra hacer match debido a que stringBuilder genera siempre nuevas referencias y en este caso el contain compara que exista una misma referencia
    // También StringBuilder no sobreescribe el método equals.
    // Si cambiaramos de StringBuilder a String, si podriamos hacer match en la busca con contains, y por ende agregariamos un nuevo día a la lista
    if(days.contains(new StringBuilder("Sunday"))) {
      days.add(new StringBuilder("Wednesday"));
    }

    System.out.println(days.size());
}}
