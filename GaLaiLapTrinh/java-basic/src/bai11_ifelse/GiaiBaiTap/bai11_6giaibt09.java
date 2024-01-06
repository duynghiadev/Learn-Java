package bai11_ifelse.GiaiBaiTap;

import java.util.Scanner;

public class bai11_6giaibt09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào 1 tháng: ");
    int thang = sc.nextInt();

    if (thang == 1 || thang == 2 || thang == 3) {
      System.out.println("Tháng " + thang + " thuộc quý 1");
    } else if (thang == 4 || thang == 5 || thang == 6) {
      System.out.println("Tháng " + thang + " thuộc quý 2");
    } else if (thang == 7 || thang == 8 || thang == 9) {
      System.out.println("Tháng " + thang + " thuộc quý 3");
    } else if (thang == 10 || thang == 11 || thang == 12) {
      System.out.println("Tháng " + thang + " thuộc quý 4");
    } else {
      System.out.println("Bạn nhập tháng tào lao");
    }
  }
}
