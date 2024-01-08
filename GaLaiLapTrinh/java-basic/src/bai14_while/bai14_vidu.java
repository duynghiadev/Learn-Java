package bai14_while;

import java.util.Scanner;

public class bai14_vidu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào số nguyên từ 1 - 99: ");

    int n = sc.nextInt();
    while (n < 1 || n > 99) {
      System.out.println("Mời nhập lại n, n chỉ được từ 1 - 99 thôi nhé, nhập lại: ");
      n = sc.nextInt();
    }
    System.out.println("Bạn đã nhập xong n = " + n);
  }
}
