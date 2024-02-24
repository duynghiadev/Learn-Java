package bai17_continue_break.GiaiBaiTap;

import java.util.Scanner;

public class bai17_4giaibtjava15 {
  /**
   * Bài tập Java 15:
   * Viết chương trình: Tìm những số chia hết cho 3 từ 10 đến 50
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào số nguyên n: ");
    int n = sc.nextInt();
    for (int i = 10; i <= n; i++) {
      if (i % 3 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
