package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số nguyên bắt đầu: ");
    int start = scanner.nextInt();
    System.out.print("Nhập số nguyên kết thúc: ");
    int end = scanner.nextInt();

    System.out.println("Các số chia hết cho 3 từ " + start + " đến " + end + " là: ");
    for (int num = start; start <= num && num <= end; num++) {
      if (num % 3 == 0) {
        System.out.println(num);
      }
    }
    scanner.close(); // Đóng scanner sau khi sử dụng xong để tránh rò rỉ tài nguyên
  }
}
