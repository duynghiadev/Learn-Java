package Lab03;

import java.util.Scanner;

public class Bai02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào 1 số nguyên bất kỳ: ");

    int x = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d ", x, i, x * 1);
      System.out.printf("\n");
    }
    scanner.close();
  }
}
