package MethodsAndEncapsulation;

public class DiferenceBetweenThisAndNoUseThis {

  String msg = null;

  public DiferenceBetweenThisAndNoUseThis() {
    this("Good Morning!");
  }

  public DiferenceBetweenThisAndNoUseThis(String str) {
    // Es importante tener en cuenta que como el parámetro del método se llama diferente al párametro de la clase, no es necesario el this. Por ende si
    // Será asignado el valor a msg. En caso dado de que en vez de llamarse str se llamara msg, si sería necesario que se agregue this.msg = msg; para que
    // El compilador entienda que debe asignarle el msg que viene en el parámetro del método al msg del parámetro de la clase.
    msg = str;
  }

  public void display() {
    System.out.println(msg);
  }

  public static void main(String [] args) {
    DiferenceBetweenThisAndNoUseThis g1 = new DiferenceBetweenThisAndNoUseThis();
    DiferenceBetweenThisAndNoUseThis g2 = new DiferenceBetweenThisAndNoUseThis("Good Evening!");
    g1.display();
    g2.display();
  }
}
