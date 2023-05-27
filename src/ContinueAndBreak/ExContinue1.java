package ContinueAndBreak;

import java.util.ArrayList;
import java.util.List;

public class ExContinue1 {
  ExContinue1() {
  }

  public static void main(String[] args)
  {
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    for (Integer I : list)
    {
      continue;
      // System.out.print(I); // Ninguna etiqueta puede ir luego de un continue o un break.
    }

  }
}
