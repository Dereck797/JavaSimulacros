package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    // Cuando yo agrego un valor en un index ya existente, se agrega y el que existia se corre 1 index hacia abajo
    list.add(0, "Array");
    list.add(0, "List");
    list.add(0,"ArrayList");

    System.out.println(list);
  }
}
