package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số a: ");
    double a = sc.nextDouble();
    System.out.println("Nhập vào số b: ");
    double b = sc.nextDouble();
    System.out.println("Nhập vào số c: ");
    double c = sc.nextDouble();

    double delta = Math.pow(b, 2) - 4 * a * c;
    double nghiemKep = (-b / 2 * a);
    double nghiemX1 = (((-b) + Math.sqrt(delta)) / 2 * a);
    double nghiemX2 = (((-b) - Math.sqrt(delta)) / 2 * a);

    System.out.printf("Phương trình: %.2fx^2 + %.2fx + %.2f\n", a, b, c);
    System.out.printf("Delta = %.2f\n", delta);

    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm");
    } else if (delta == 0) {
      System.out.println("Phương trình có nghiệm kép x1 = x2: " + nghiemKep);
    } else {
      System.out.println("Phương trình có 2 nghiệm phân biệt: ");
      System.out.println("x1 = " + nghiemX1);
      System.out.println("x2 = " + nghiemX2);
    }
  }
}
