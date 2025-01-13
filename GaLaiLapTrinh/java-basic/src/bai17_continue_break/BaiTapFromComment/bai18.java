package bai17_continue_break.BaiTapFromComment;

import java.util.Scanner;

public class bai18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int traloi;
    do {
      System.out.println("Vui lòng nhập vào số nguyên dương cần kiểm tra:");
      int a = scanner.nextInt();
      if (isPrime(a)) {
        System.out.println("Số " + a + " là số nguyên tố");
      } else {
        System.out.print("Số " + a + " không phải là số nguyên tố và chia hết cho các số: ");
        printDivisors(a);
      }
      System.out.println("Bạn có muốn tiếp tục chương trình không?");
      System.out.println("1. Có       2. Không");
      traloi = scanner.nextInt();
    } while (traloi == 1);
    scanner.close(); // Đóng scanner sau khi sử dụng xong để tránh rò rỉ tài nguyên
  }

  // Kiểm tra số nguyên tố
  private static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // In ra các ước của số
  private static void printDivisors(int num) {
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
