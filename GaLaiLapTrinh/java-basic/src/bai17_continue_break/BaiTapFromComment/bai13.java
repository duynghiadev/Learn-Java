package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai13 {
  public static void main(String[] args) {
    // Viet chuong trinh nhap so a tu ban phim
    // Neu a chan thi tinh tong cac so chan tu 0 den a
    // Neu a le thi in ra dong chu"Toi khong tinh tong le, bye bye" va thoat chuong trinh
    Scanner sc = new Scanner(System.in);
    int a;
    int sum = 0;
    System.out.println("Nhap so a: ");
    a = sc.nextInt();

    for (int i = 0; i <= a; i += 2) {
      if (a % 2 == 0) {
        System.out.println("i:" + i);
        sum += i;
      } else {
        System.out.println("Toi khong tinh tong so le, bye bye!!!");
        break;
      }

    }
    System.out.println("Tong= " + sum);
  }
}
