package ListAndArrayList;

import java.util.ArrayList;

class Counter {
  Integer count;
  Counter(int count) {
    this.count = count;
  }

  public String toString() {
    return "Counter-" + count;
  }
}

public class CloneMethod2 {

  public static void main(String[] args) {
    ArrayList<Counter> original = new ArrayList<>();
    original.add(new Counter(10));

    ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
    cloned.get(0).count = 5;

    System.out.println(original);
  }
}
