package bai17_continue_break.GiaiBaiTap;

import java.util.Scanner;

public class bai17_3giaibtjava14 {
  /**
   * Bài tập Java 14:
   * <p>
   * Viết chương trình tính tổng các số lẻ từ 1 đến n
   * - n được nhập từ bàn phím
   * 1. Nếu nhập n = 7 => thì phải bỏ qua cộng với số 3, sau đó in ra kết quả 13 (vì 1+5+7=13)
   * 2. Thử break khi vòng lặp chạy đến giá trị n = 3
   */
  public static void main(String[] args) {
    int n;
    int tong = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào số nguyên n: ");
    n = sc.nextInt();

    if (n % 2 != 0) {
      for (int i = 1; i <= n; i += 2) {
        if (i == 3) {
          continue; // bỏ qua giá trị 3 và chạy các số khác
        } else {
          tong += i;
        }
      }
      System.out.println("Tổng các số lẻ từ 1 đến " + n + "là: " + tong);
    }
  }
}
