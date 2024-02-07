package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập giới hạn trên của phạm vi các số hoàn hảo: ");
    int limit = scanner.nextInt();

    System.out.println("Các số hoàn hảo từ 1 đến " + limit + " là:");
    for (int i = 1; i <= limit; i++) {
      int sum = 0;
      for (int j = 1; j <= i / 2; j++) {
        if (i % j == 0) {
          // Tính tổng các ước số của i
          sum += j;
        }
      }
      if (sum == i) {
        System.out.print(i + "\t");
      }
    }
    scanner.close(); // Đóng scanner sau khi sử dụng xong để tránh rò rỉ tài nguyên
  }
}
