package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListRemove4 {

  public static void main(String[] args) {
    // Esto es posible y no genera un error de compilación ni tampoco un nullPointerException en ejecución
    List<String> list = new ArrayList<>();
    list.add(null);
    list.add(null);
    list.add(null);
    // En este caso al utilizar list.remove(0), nos retorna un null debido a que en esa posición existe esa asignación
    // en el caso de utilizar list.remove(null) nos retorna un true debido a que si encontró esa coincidencia en la lista
    System.out.println(list.remove(0) + ":" + list.remove(null));
    System.out.println();
  }

}
