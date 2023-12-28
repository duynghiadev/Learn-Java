import java.util.Scanner;

public class Bai03 {
  public static void main(String[] args) {
    /**
     * - Dưới 10M: không đóng thuế
     * - Từ 10M đến 15M: thuế 10%
     * - Từ 15M đến 30M: thuế 20%
     * - Trên 30M: thuế 50%
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("tax = ");
    int tax = scanner.nextInt();

    if (tax < 10) {
      System.out.println("No tax");
    } else if (10 <= tax && tax <= 15) {
      System.out.println("tax 10%");
    } else if (15 <= tax && tax <= 30) {
      System.out.println("tax 20%");
    } else {
      System.out.println("tax 50%");
    }
  }
}
