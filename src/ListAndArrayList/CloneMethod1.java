package ListAndArrayList;

import java.util.ArrayList;

public class CloneMethod1 {
  public static void main(String[] args) {
    ArrayList<Integer> original = new ArrayList<>();
    original.add(new Integer(10));


    // por más de que tanto el primer elemento de original como de cloned apunten al mismo lugar en memoria y que en este caso
    // i1 en la línea 14 también apunte al mismo lugar en memória. No es posible modificar el valor de ese espacio en memoria intentando modificar i1
    // Debido a que cuando se realiza la operación ++i1 se genera una nueva referencia de asignación y por lo tanto i1 deja de apuntar al lugar al que apuntaba inicialmente
    // Esto podría ser posible en dado caso de que en vez de Integer se defina un objeto Mutable
    ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
    Object i1 = cloned.get(0);
    i1 = 11;

    System.out.println(cloned);
  }
}
