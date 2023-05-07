package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListRemove3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("THREE");

    // list.remove(index) retorna el valor que contenía la posición eliminada
    System.out.println(list.remove(2));
    // list.remove(Object) retorna verdadero o falso dependiendo de si encontró o no el valor a eliminar
    System.out.println(list.remove("THREE"));

    if( true /*list.remove(2) retorna el valor que se eliminó, mas no un valor boolean */) {
      list.remove("THREE");
    }

    System.out.println(list);

  }
}
