package bai17_continue_break.GiaiBaiTap;

import java.util.Scanner;

public class bai17_1giaibtjava12 {
  /**
   * java 12:
   * - Viết chương trình nhập vào số nguyên n, in ra kết quả n! (n giai thừa)
   * - Dùng vòng lặp for
   * - Dùng vòng lặp while
   * Ví dụ: for() => 3! = 1*2*3
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào số nguyên n: ");
    int n = sc.nextInt();
    int giaiThuaFor = 1;
    int giaiThuaWhile = 1;

    // for loop
    System.out.println("------------Vòng lặp for--------------");
    for (int i = 1; i <= n; i++) {
      giaiThuaFor *= i;
    }
    System.out.println(n + "! = " + giaiThuaFor);
    System.out.println("--------------------------------------");

    // while loop
    System.out.println("------------Vòng lặp while--------------");
    int m = 1;
    while (m <= n) {
      giaiThuaWhile *= m;
      m++;
    }
    System.out.println(n + "! = " + giaiThuaWhile);
  }
}
