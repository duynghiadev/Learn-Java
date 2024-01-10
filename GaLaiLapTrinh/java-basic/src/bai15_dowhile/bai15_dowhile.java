package bai15_dowhile;

public class bai15_dowhile {
  public static void main(String[] args) {
    // tính tổng các số từ 1 -> 5
    int a = 1;
    int tong = 0;
    do {
      tong += a; // tong = tong + a
      System.out.println("Tong in statement do: " + tong);
      a++;
    } while (a <= 5);
    System.out.println("Tong = " + tong);
  }
}
