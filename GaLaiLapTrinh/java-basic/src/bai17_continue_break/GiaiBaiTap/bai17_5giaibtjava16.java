package bai17_continue_break.GiaiBaiTap;

public class bai17_5giaibtjava16 {
  /**
   * Bài tập java 16:
   * - Viết chương trình: Tính tổng S = 1! + 2! + 3! + .. + 10!
   */
  public static void main(String[] args) {
    int m = 1;
    int tong = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.println("i:" + i);
      m = i * m; // m*=i
      System.out.println("m:" + m);
      tong += m;
    }
    System.out.println("Tổng:" + tong);
  }
}
