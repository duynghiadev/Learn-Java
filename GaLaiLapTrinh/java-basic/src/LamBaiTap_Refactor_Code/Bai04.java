package LamBaiTap_Refactor_Code;

import java.util.Scanner;

public class Bai04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Nhập Tổng và Hiệu
    System.out.println("Nhập Tổng 2 số: ");
    double tong = sc.nextDouble();

    System.out.println("Nhập Hiệu 2 số: ");
    double hieu = sc.nextDouble();

    System.out.println(); // In một dòng trống để tạo khoảng cách

    // Tính Toán
    double x = (tong + hieu) / 2;
    double y = (tong - hieu) / 2;

    // Xuất Kết Quả
    System.out.printf("%.2fx + (%.2f)y = %.2f\n", x, y, tong);
    System.out.printf("%.2fx - (%.2f)y = %.2f\n", x, y, hieu);

    // Xuất giá trị của x và y
    System.out.println("Giá trị của x là: " + x);
    System.out.println("Giá trị của y là: " + y);
  }
}
