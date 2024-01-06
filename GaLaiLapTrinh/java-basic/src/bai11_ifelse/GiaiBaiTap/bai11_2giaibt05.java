package bai11_ifelse.GiaiBaiTap;

import java.util.Scanner;

public class bai11_2giaibt05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào chiều cao (m): ");
    double chieuCao = sc.nextDouble();
    System.out.println("Mời nhập vào cân nặng (kg): ");
    double canNang = sc.nextDouble();

    // tính BMI
    double bmi = canNang / (Math.pow(chieuCao, 2));
    // kiểm tra điều kiện
    if (bmi < 15)
      System.out.println("Thân hình quá gầy");
    else if (bmi >= 15 && bmi < 16)
      System.out.println("Thân hình gầy");
    else if (bmi >= 16 && bmi < 18.5)
      System.out.println("Thân hình hơi gầy");
    else if (bmi >= 18.5 && bmi < 25)
      System.out.println("Thân hình bình thường");
    else if (bmi >= 25 && bmi < 30)
      System.out.println("Thân hình hơi béo");
    else if (bmi >= 30 && bmi < 35)
      System.out.println("Thân hình béo");
    else
      System.out.println("Thân hình béo");
  }
}
