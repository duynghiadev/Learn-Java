package bai17_continue_break;

public class bai17_continue_break {
  public static void main(String[] args) {
    // tính tổng từ 1 -> 5, nhưng phải bỏ qua số 3
    int tong = 0;
    for (int i = 0; i <= 5; i++) {
      if (i == 3) {
        continue;
      } else {
        tong += i;
      }
    }
    System.out.println("Tổng:" + tong);
    int n = 0;
    while (n < 100) {
      System.out.println("n = " + n);
      if (n == 15) {
        break;
      }
      n++;
    }
  }
}