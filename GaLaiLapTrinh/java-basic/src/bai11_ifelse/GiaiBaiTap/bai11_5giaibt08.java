package bai11_ifelse.GiaiBaiTap;

import java.util.Scanner;

public class bai11_5giaibt08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // nhập vào 3 hệ số a, b, c
    System.out.println("Nhập vào hệ số a: ");
    double a = sc.nextDouble();
    System.out.println("Nhập vào hệ số b: ");
    double b = sc.nextDouble();
    System.out.println("Nhập vào hệ số c: ");
    double c = sc.nextDouble();

    // tính delta
    double delta = Math.pow(b, 2) - (4 * a * c);
    // kiểm tra điều kiện
    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm");
    } else if (delta == 0) {
      double x = -b / (2 * a);
      System.out.println("Phương trình có nghiệm kép x = " + x);
    } else {
      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.println("Phương trình có 2 nghiệm phân biệt:");
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }
  }
}
