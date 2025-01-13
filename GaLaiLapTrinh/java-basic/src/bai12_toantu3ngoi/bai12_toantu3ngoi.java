package bai12_toantu3ngoi;

import java.util.Scanner;

public class bai12_toantu3ngoi {
  public static void main(String[] args) {
    // Nhập vào bàn phím 1 số, và kiểm tra chẵn lẻ
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào 1 số nguyên n: ");
    int n = sc.nextInt();
    String traLoi = (n % 2 == 0) ? "chẳn" : "lẻ";
    System.out.println("Số " + n + " vừa nhập là số: " + traLoi);
  }
}
