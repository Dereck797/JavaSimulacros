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

    System.out.println(list.remove(2));
    System.out.println(list.remove("THREE"));

    if( true /*list.remove(2) retorna el valor que se eliminó, mas no un valor boolean */) {
      list.remove("THREE");
    }

    System.out.println(list);

  }
}
