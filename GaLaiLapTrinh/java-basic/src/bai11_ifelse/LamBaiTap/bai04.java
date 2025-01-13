package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai04 {
  public static void main(String[] args) {
    // Nhập Tổng Hiệu
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập Tổng 2 số: ");
    double tong = sc.nextDouble();
    System.out.println("Nhập Hiệu 2 số: ");
    double hieu = sc.nextDouble();
    System.out.println("\n");

    // Tính Toán
    double x = (tong + hieu) / 2;
    double y = (tong - hieu) / 2;

    // Xuất Kết Quả
    System.out.printf("%.2fx + (%.2f)y = %.2f\n", x, y, tong);
    System.out.printf("%.2fx - (%.2f)y = %.2f\n", x, y, hieu);

    System.out.println("Giá trị của x là: " + x);
    System.out.println("Giá trị của y là: " + y);
  }
}
