package LamBaiTap_Refactor_Code;

import java.util.Scanner;

public class Bai06 {
  public static void main(String[] args) {
    // Nhập năm cần tra cứu
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập năm cần tra cứu: ");
    int nam = sc.nextInt();

    // Xuất kết quả
    if (isLeapYear(nam)) {
      System.out.println("Năm bạn vừa nhập là năm nhuận");
    } else {
      System.out.println("Năm bạn vừa nhập không phải năm nhuận");
    }
  }

  // Kiểm tra năm nhuận
  private static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
}
