package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tháng cần tra cứu: ");
    double thang = sc.nextDouble();

    if ((thang == 1) || (thang == 2) || (thang == 3)) {
      System.out.println("Tháng này thuộc Quý 1");
    } else if ((thang == 4) || (thang == 5) || (thang == 6)) {
      System.out.println("Tháng này thuộc Quý 2");
    } else if ((thang == 7) || (thang == 8) || (thang == 9)) {
      System.out.println("Tháng này thuộc Quý 3");
    } else {
      System.out.println("Tháng này thuộc Quý 4");
    }
  }
}
