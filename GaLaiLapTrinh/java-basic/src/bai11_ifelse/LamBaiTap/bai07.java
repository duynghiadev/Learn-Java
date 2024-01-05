package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tháng cần tra cứu: ");
    double thang = sc.nextDouble();
    if ((thang == 1) || (thang == 3) || (thang == 5) || (thang == 7) || (thang == 8) || (thang == 10) || (thang == 12)) {
      System.out.println("Tháng này có 31 ngày");
    } else if ((thang == 4) || (thang == 6) || (thang == 9) || (thang == 11)) {
      System.out.println("Tháng này có 30 ngày");
    } else if (thang == 2) {
      System.out.println("Bạn cần nhập thêm năm: ");
      double nam = sc.nextDouble();
      if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
        System.out.println("Tháng 2 có 29 ngày");
      } else {
        System.out.println("Tháng 2 có 28 ngày");
      }
    }
  }
}
