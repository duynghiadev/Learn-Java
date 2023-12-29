package Lab02;

import java.util.Scanner;

public class Bai02 {
  public static void giaiPhuongTrinhBacNhat(int a, int b) {
    System.out.printf("Bài 01: Giải phương trình bậc nhất  %dx + %d = 0 \n", a, b);

    if (a == 0 && b == 0) {
      System.out.printf("Phương trình có vô số nghiệm");
    } else if (a == 0 && b != 0) {
      System.out.println("Phương trình không có nghiệm");
    } else {
      float x = (float) -b / a;

      System.out.printf("Phương trình có nghiệm = %.5f", x);
    }
  }

  public static void main(String[] args) {
    /**
     * Cho phương trình: ax^2 + bx + c = 0
     * Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương
     * trình trên
     * Gợi ý:
     * - Nếu a = 0 => làm tương tự ví dụ bài 1
     * - Nếu a # 0:
     * - Tính delta = b^2 - 4ac.
     * - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
     * - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
     * - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
     * x1 = (-b + căn(delta))/(2*a)
     * x2 = (-b - căn(delta))/(2*a)
     */
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
      giaiPhuongTrinhBacNhat(b, c);
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
}
