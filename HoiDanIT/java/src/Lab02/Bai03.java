package Lab02;

import java.util.Scanner;

public class Bai03 {
  public static void main(String[] args) {
    /**
     * Viết chương trình tính số tiền điện (in kết quả ra console)
     *
     * Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
     * - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
     * - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
     * Gợi ý:
     * - Nếu số điện <= 100 => số tiền = số điện x 1000
     * - Nêu số điện > 100
     * => số tiền = 100 * 1000 + (số điện - 100) * 1500
     */
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bài 03 trong Lab02");
    System.out.println("Chương trình tính tiền điện");
    System.out.print("Nhập vào số điện: ");

    int a = scanner.nextInt();
    if (a <= 100) {
      int money = a * 1000;
      System.out.println("Số tiền điện = " + money);
    } else {
      int money = 100 * 1000 + (a - 100) * 1500;
      System.out.println("Số tiền điện = " + money);
    }

    scanner.close();
  }
}
