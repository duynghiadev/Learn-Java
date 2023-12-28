import java.util.Scanner;

public class Bai02 {
  public static void main(String[] args) {
    /**
     * - Tính chu vi hình chữ nhật
     * - Tính diện tích hình chữ nhật
     * - Tìm cạnh nhỏ nhất của hình chữ nhật
     */

    System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
    Scanner scanner = new Scanner(System.in);
    int chieuRong = scanner.nextInt();

    System.out.println("Nhập vào chiều dài hình chữ nhật: ");
    int chieuDai = scanner.nextInt();

    int chuVi = (chieuDai + chieuRong) * 2;
    int dienTich = chieuDai * chieuRong;
    int canhMin = Math.min(chieuDai, chieuRong);

    System.out.println("Chu vi = " + chuVi);
    System.out.println("Diện tích = " + dienTich);
    System.out.println("Cạnh min = " + canhMin);

    scanner.close();
  }
}
