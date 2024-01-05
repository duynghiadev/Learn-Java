package LamBaiTap_Refactor_Code;

import java.util.Scanner;

public class Bai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập tháng cần tra cứu: ");
    int thang = sc.nextInt();

    int quarter = calculateQuarter(thang);

    displayQuarter(thang, quarter);
  }

  private static int calculateQuarter(int thang) {
    if (thang >= 1 && thang <= 3) {
      return 1;
    } else if (thang >= 4 && thang <= 6) {
      return 2;
    } else if (thang >= 7 && thang <= 9) {
      return 3;
    } else {
      return 4;
    }
  }

  private static void displayQuarter(int thang, int quarter) {
    System.out.printf("Tháng %d thuộc Quý %d\n", thang, quarter);
  }
}
