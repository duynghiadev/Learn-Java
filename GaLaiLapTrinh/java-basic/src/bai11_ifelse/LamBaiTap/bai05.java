package bai11_ifelse.LamBaiTap;

import java.util.Scanner;

public class bai05 {
  public static void main(String[] args) {
    // Nhập chiều cao, cân nặng
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập Chiều Cao: ");
    double chieuCao = sc.nextDouble();
    System.out.println("Nhập Cân Nặng: ");
    double canNang = sc.nextDouble();

    // Tính toán
    double BMI = canNang / (Math.pow(chieuCao, 2));
    System.out.println("Chỉ số BMI là: " + BMI);

    // Xuất kết quả
    if (BMI < 15)
      System.out.println("Thân hình quá gầy");
    else if (BMI >= 15 && BMI < 16)
      System.out.println("Thân hình gầy");
    else if (BMI >= 16 && BMI < 18.5)
      System.out.println("Thân hình hơi gầy");
    else if (BMI >= 18.5 && BMI < 25)
      System.out.println("Thân hình cân đối");
    else if (BMI >= 25 && BMI < 30)
      System.out.println("Thân hình hơi béo");
    else if (BMI >= 30 && BMI < 35)
      System.out.println("Thân hình béo");
    else
      System.out.println("Thân hình quá béo");
  }
}
