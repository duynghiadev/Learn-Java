package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai14 {
  public static void main(String[] args) {
    // tính tổng từ 1 -> n, n nhâp từ bàn phím
    // nhập n = 7, bỏ qua không cộng tổng với số 3 => in ra kết quả
    //thử break khi vòng lặp chạy đến giá trị n=3
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập n từ bàn phím n = ");
    int n = sc.nextInt();
    int tong = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 != 0) {
        if (i == 3) {
          continue;
        } else {
          System.out.println("i:" + i);
          tong += i;
        }
      }
    }
    System.out.println("Tổng số lẻ tử 0-" + n + " là: " + tong);
  }
}
