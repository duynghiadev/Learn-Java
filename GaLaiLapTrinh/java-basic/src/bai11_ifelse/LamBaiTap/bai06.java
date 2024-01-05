package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai06 {
  public static void main(String[] args) {
    // Nhập năm cần tra cứu
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập năm cần tra cứu: ");
    double nam = sc.nextDouble();

    // Xuất kết quả
    if (((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))) {
      System.out.println("Năm bạn vừa nhập là năm nhuận");
    } else {
      System.out.println("Năm bạn vừa nhập không phải năm nhuận");
    }
  }
}
