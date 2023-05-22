package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class NoAddZeroIndexToList {
  public static void main(String[] args) {
    List<String> trafficLight = new ArrayList<>();
    // Es importante entender que una lista siempre debe llenarse desde el indice 0 hasta el siguiente indice, de lo contrarío genera un error de tipo IndexOutOfBoundsException
    trafficLight.add(1, "RED");
    trafficLight.add(2, "ORANGE");
    trafficLight.add(3, "GREEN");

    trafficLight.remove(new Integer(2));

    System.out.println(trafficLight);
  }
}
