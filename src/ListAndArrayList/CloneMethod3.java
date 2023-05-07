package ListAndArrayList;

import java.util.ArrayList;

class Numero{
  Integer numero;

  Numero(Integer numero){
    this.numero = numero;
  }
}

public class CloneMethod3 {

  public static void main(String[] args) {
    ArrayList<Numero> original = new ArrayList<>();
    original.add(new Numero(10));

    // Este caso es similar al de la clase CloneMethod1, Sin embargo debido a que se crea una clase mutable diferente a Integer(La cual no puede ser mutable), Es posible
    // Asignar la referencia a i1, y que al modificar el valor almacenado en esa referencia también se modifiquen las variables a las que apunta esa referenc
    ArrayList<Numero> cloned = (ArrayList<Numero>) original.clone();
    Numero i1 = cloned.get(0);
    i1.numero = 11;

    System.out.println(cloned);
  }
}
