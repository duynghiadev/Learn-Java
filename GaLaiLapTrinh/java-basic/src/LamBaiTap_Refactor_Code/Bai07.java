package LamBaiTap_Refactor_Code;

import java.util.Scanner;

public class Bai07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tháng cần tra cứu: ");
    int thang = sc.nextInt();

    if (isValidMonth(thang)) {
      int soNgay = getSoNgayTrongThang(thang);
      System.out.println("Tháng này có " + soNgay + " ngày");
    } else {
      System.out.println("Tháng không hợp lệ");
    }
  }

  private static boolean isValidMonth(int thang) {
    return thang >= 1 && thang <= 12;
  }

  private static int getSoNgayTrongThang(int thang) {
    // Cách dài dòng
    switch (thang) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return getSoNgayThang2();
      default:
        return -1; // Trả về -1 nếu tháng không hợp lệ
    }
    // Cách ngắn gọn
//    return switch (thang) {
//      case 1, 3, 5, 7, 8, 10, 12 -> 31;
//      case 4, 6, 9, 11 -> 30;
//      case 2 -> getSoNgayThang2();
//      default -> -1; // Trả về -1 nếu tháng không hợp lệ
//    };
  }

  private static int getSoNgayThang2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập năm: ");
    int nam = sc.nextInt();

    if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
      return 29;
    } else {
      return 28;
    }
  }
}
