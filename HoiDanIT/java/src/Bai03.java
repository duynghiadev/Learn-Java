import java.util.Scanner;

public class Bai03 {
  public static void main(String[] args) {
    System.out.println("Nhập vào cạnh hình lập phương: ");
    Scanner scanner = new Scanner(System.in);
    int canh = scanner.nextInt();
    double theTich = Math.pow(canh, 3);
    System.out.println("Thể tích = " + theTich);
  }
}
