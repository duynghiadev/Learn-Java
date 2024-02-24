package bai17_continue_break.GiaiBaiTap;

import java.util.Scanner;

public class bai17_2giaibtjava13 {
  /**
   * Bài tập Java 13:
   * <p>
   * - Viết chương trình nhập số a từ bàn phím
   * - Nếu a chẵn thì tính tổng các số chẳn từ 0 đến a => số chẳn thì i = i + 2
   * - Nếu a lẻ thì in ra dòng chữ "tôi không tính số lẻ, bye bye" và thoát khỏi chương trình
   */
  public static void main(String[] args) {
    int a;
    int tong = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào số nguyên a: ");
    a = sc.nextInt();
    if (a % 2 != 0) {
      System.out.println("Tôi không tính số lẻ, bye bye");
    } else {
      for (int i = 0; i <= a; i += 2) {
        tong += i; // tong = tong + i
      }
      System.out.println("Tổng các số chẳn từ 0 đến " + a + " là: " + tong);
    }
  }
}
