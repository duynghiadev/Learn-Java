package bai15_dowhile;

public class bai15_whiletrue {
  public static void main(String[] args) {
    int n = 0;
    while (true) {
      n++;
      System.out.println("n = " + n);
      if (n == 9)
        break;
    }
  }
}
