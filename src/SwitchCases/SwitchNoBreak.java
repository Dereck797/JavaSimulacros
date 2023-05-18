package SwitchCases;

public class SwitchNoBreak {
  public static void main(String[] args) {

    final char a = 'A', d = 'D';
    char grade = 'B';
    switch(grade) {
        case a:
        case 'B':
          System.out.print("great");
        case 'C':
          System.out.print("good");
        case d:
        case 'F':
          System.out.print("not good");
    }
  }
}