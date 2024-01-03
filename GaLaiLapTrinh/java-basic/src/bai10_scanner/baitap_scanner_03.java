package bai10_scanner;

import java.util.Scanner;

public class baitap_scanner_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Mời nhập chiều dài a:");
    double a = new Scanner(System.in).nextDouble();

    System.out.println("Mời nhập chiều rộng b:");
    double b = new Scanner(System.in).nextDouble();

    double P = (a + b) * 2;
    double S = a * b;

    System.out.println("Chu vi là \t" + P);
    System.out.println("Diện tích là \t" + S);

    sc.close();
  }
}
