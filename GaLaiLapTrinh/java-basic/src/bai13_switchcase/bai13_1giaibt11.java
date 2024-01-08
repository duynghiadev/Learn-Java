package bai13_switchcase;

import java.util.Scanner;

public class bai13_1giaibt11 {
  public static void main(String[] args) {
    /**
     * Bài tập 11: Áp dụng switch case
     *
     * Viết chương trình khung tìm kiếm: cho người dùng nhập vào tùy chọn
     * 1. Tìm theo tên
     * 2. Tìm theo tác giả
     * 3. Tìm theo nhà xuất bản
     * 4. Tìm theo tiêu đề
     * => Thoát nếu phím bấm không hợp lệ
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời bấm phím để chọn:");
    System.out.println("Bấm 1: Tìm theo tên");
    System.out.println("Bấm 2: Tìm theo tác giả");
    System.out.println("Bấm 3: Tìm theo nhà xuất bản");
    System.out.println("Bấm 4: Tìm theo tiêu đề");

    int so = sc.nextInt();
    switch (so) {
      case 1:
        System.out.println("Tìm theo tên");
        break;
      case 2:
        System.out.println("Tìm theo tác giả");
        break;
      case 3:
        System.out.println("Tìm theo nhà xuất bản");
        break;
      case 4:
        System.out.println("Tìm theo tiêu đề");
        break;
      default:
        System.out.println("Phím bấm không hợp lệ");
    }
  }
}
