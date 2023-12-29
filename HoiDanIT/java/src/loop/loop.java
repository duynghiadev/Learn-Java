package loop;

public class loop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("for " + i);
    }

    System.out.println("===========================");

    int i = 1;
    while (i < 5) {
      System.out.println("while " + i);
      i++;
    }

    System.out.println("===========================");

    int k = 9;
    do {
      System.out.println("do while " + k);
      k++;
    } while (k < 5);

    System.out.println("===========================");

    for (int j = 0; j < 10; j++) {
      if (j == 4) {
        break;
      }
      System.out.println("j " + j);
    }

    System.out.println("===========================");

    for (int m = 0; m < 10; m++) {
      if (m == 4) {
        continue;
      }
      System.out.println("m " + m);
    }
  }
}
