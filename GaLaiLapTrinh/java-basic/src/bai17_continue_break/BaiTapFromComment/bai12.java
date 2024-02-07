package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai12 {
  //    viết chương trình nhập vào số nguyên n,, in ra kết quả n!
  public static void main(String[] args) {
    System.out.println("Mời nhập số nguyên n= ");
    int n = new Scanner(System.in).nextInt();
    int giaiThua = 1;
    int i = 1;
    System.out.println("Mời chọn phương pháp thuật toán");
    System.out.println("1. Giải bằng vòng lập for");
    System.out.println("2. Giải bằng vòng lập while");

    int option = new Scanner(System.in).nextInt();
    switch (option) {
      case 1:
        for (i = 1; i <= n; i++) {
          giaiThua *= i;
        }
        System.out.println("Kết quả " + n + "!= " + giaiThua);
        break;
      case 2:
        while (i <= n) {
          giaiThua *= i;
          i++;
        }
        System.out.println("Kết quả " + n + "!= " + giaiThua);
        break;
      default:
        System.out.println("Bạn nhập sai");
    }
  }
}
