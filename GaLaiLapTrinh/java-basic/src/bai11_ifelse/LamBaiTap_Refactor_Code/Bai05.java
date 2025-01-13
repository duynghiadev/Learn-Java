package bai11_ifelse.LamBaiTap_Refactor_Code;

import java.util.Scanner;

public class Bai05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập Chiều Cao: ");
    double chieuCao = sc.nextDouble();

    System.out.println("Nhập Cân Nặng: ");
    double canNang = sc.nextDouble();

    double BMI = canNang / Math.pow(chieuCao, 2);
    System.out.println("Chỉ số BMI là: " + BMI);

    interpretBMI(BMI);
  }

  private static void interpretBMI(double BMI) {
    String[] categories = {
        "Thân hình quá gầy",
        "Thân hình gầy",
        "Thân hình hơi gầy",
        "Thân hình cân đối",
        "Thân hình hơi béo",
        "Thân hình béo",
        "Thân hình quá béo"
    };

    int index = (int) Math.min(Math.floor(BMI / 5), categories.length - 1);

    double mathFloor = Math.floor(BMI / 5);
    System.out.println("mathFloor value: " + mathFloor);

    int lengthCategories = categories.length - 1;
    System.out.println("categories.length - 1: " + lengthCategories);

    System.out.println(categories[index]);
  }
}
