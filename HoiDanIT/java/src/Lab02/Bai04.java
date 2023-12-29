package Lab02;

import java.util.Scanner;

public class Bai04 {
  public static void bai01() {
    System.out.println(">> LỰA CHỌN TÍNH NĂNG 1<<");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào biến a = ");
    int a = scanner.nextInt();
    System.out.print("Nhập vào biến b = ");
    int b = scanner.nextInt();

    System.out.printf("Bài 01: Giải phương trình bậc nhất  %dx + %d = 0 \n", a, b);

    if (a == 0 && b == 0) {
      System.out.printf("Phương trình có vô số nghiệm");
    } else if (a == 0 && b != 0) {
      System.out.println("Phương trình không có nghiệm");
    } else {
      float x = (float) -b / a;

      System.out.printf("Phương trình có nghiệm = %.5f", x);
    }

    scanner.close();
  }

  public static void bai02() {
    System.out.println(">> LỰA CHỌN TÍNH NĂNG 2<<");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào biến a: ");
    int a = scanner.nextInt();
    System.out.print("Nhập vào biến b: ");
    int b = scanner.nextInt();
    System.out.print("Nhập vào biến c: ");
    int c = scanner.nextInt();

    System.out.printf("Bài 02: Giải phương trình bậc 2 %dx^2 + %dx + %d = 0 \n", a, b, c);

    if (a == 0) {
      // Viết logic giải phương trình bậc nhất
      // bai01();
    } else {
      int delta = b * b - 4 * a * c;
      if (delta < 0) {
        System.out.println("Phương trình vô nghiệm");
      } else if (delta == 0) {
        float x = (float) -b / (2 * a);
        System.out.printf("Phương trình có nghiệm kép x = %.3f", x);
      } else {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("Phương trình có 2 nghiệm riêng biệt, x1 = %.3f, x2 = %.3f", x1, x2);
      }
    }

    scanner.close();
  }

  public static void bai03() {
    Scanner scanner = new Scanner(System.in);

    System.out.println(">> LỰA CHỌN TÍNH NĂNG 3<<");
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

  public static void main(String[] args) {
    /**
     * Viết chương trình tổ chức menu:
     *
     * System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
     * System.out.println("++ ----------------------------------------- ++");
     * System.out.println("| 1. Giải phương trình bậc nhất |");
     * System.out.println("| 2. Giải phương trình bậc hai |");
     * System.out.println("| 3. Tính số tiền điện |");
     * System.out.println("| 4. Kết thúc |");
     * System.out.println("++ ------------------ ++");
     *
     * Yêu cầu:
     * - Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên
     */
    Scanner scanner = new Scanner(System.in);

    System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
    System.out.println("++ ----------------------------------------- ++");
    System.out.println("| 1. Giải phương trình bậc nhất |");
    System.out.println("| 2. Giải phương trình bậc hai |");
    System.out.println("| 3. Tính số tiền điện |");
    System.out.println("| 4. Kết thúc |");
    System.out.println("++ ------------------ ++");

    System.out.print("Lựa chọn của bạn: ");
    int x = scanner.nextInt();

    switch (x) {
      case 1:
        // Giải phương trình bậc nhất
        bai01();
        break;
      case 2:
        // Giải phương trình bậc 2
        bai02();
        break;
      case 3:
        // Giải phương trình bậc 3
        bai03();
        break;
      default:
        System.out.println(">> BẠN ĐÃ THOÁT CHƯƠNG TRÌNH <<");
        System.exit(0);
        break;
    }
    scanner.close();
  }
}
