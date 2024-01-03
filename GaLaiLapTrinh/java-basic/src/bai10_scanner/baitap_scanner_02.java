package bai10_scanner;

import java.util.Scanner;

public class baitap_scanner_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhâp vào bán kính đường tròn r: ");
    double r = sc.nextDouble();
    double cv = 2 * Math.PI * r;
    double dt = Math.PI * Math.pow(r, 2);
    // xuất kết quả
    System.out.println("Chu vi là: " + cv);
    System.out.println("Diện tích là: " + dt);

    sc.close();
  }
}
