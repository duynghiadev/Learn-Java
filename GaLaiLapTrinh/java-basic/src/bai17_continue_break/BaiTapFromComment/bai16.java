package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số nguyên n: ");
    int n = scanner.nextInt();

    int tong = 0;
    int gt = 1;
    for (int i = 1; i <= n; i++) {
      gt *= i;
      tong += gt;
    }
    System.out.println("Tổng giai thừa các số từ 1 đến " + n + " là: " + tong);
    scanner.close(); // Đóng scanner sau khi sử dụng xong để tránh rò rỉ tài nguyên
  }
}
