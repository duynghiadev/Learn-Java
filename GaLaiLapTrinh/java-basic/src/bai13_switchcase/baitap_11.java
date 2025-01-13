package bai13_switchcase;

import java.util.Scanner;

public class baitap_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời bấm số để chọn:\n"
        .concat("1. Tìm theo tên.\n")
        .concat("2. Tìm theo tên tác giả.\n")
        .concat("3. Tìm theo nhà xuất bản.\n")
        .concat("4. Tìm theo tiêu đề.\n"));
    try {
      int search = sc.nextInt();

      switch (search) {
        case 1:
          System.out.println("Tìm theo tên.");
          break;
        case 2:
          System.out.println("Tìm theo tên tác giả.");
          break;
        case 3:
          System.out.println("Tìm theo nhà xuất bản.");
          break;
        case 4:
          System.out.println("Tìm theo tiêu đề.");
          break;
        default:
          System.out.println("Phím bấm không hợp lệ!");

      }
    } catch (Exception e) {
      System.out.println("Lỗi input.");
    }
  }
}
