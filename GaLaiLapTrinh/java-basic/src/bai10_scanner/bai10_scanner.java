package bai10_scanner;

import java.util.Scanner;

public class bai10_scanner {
  public static void main(String[] args) {
    // // Khởi tạo 1 đối tượng scanner
    // Scanner sc = new Scanner(System.in);

    // // Cho phép nhập chuỗi
    // System.out.println("Mời nhập vào mật khẩu cấp 1: ");
    // String mk1 = sc.nextLine();
    // System.out.printf("mk cấp 1 là: ", mk1);
    // // Nhập số nguyên
    // System.out.println("Mời nhập vào số nguyên a: ");
    // int a = sc.nextInt();
    // System.out.println("a: " + a);
    // // Nhập số float
    // System.out.println("Mời nhập vào số float b: ");
    // float b = sc.nextFloat();
    // System.out.println("b: " + b);
    // // Nhập số double
    // System.out.println("Mời nhập vào số double c: ");
    // double c = sc.nextDouble();
    // System.out.println("c: " + c);
    // // Nhập số long
    // System.out.println("Mời nhập vào số long d: ");
    // long d = sc.nextLong();
    // System.out.println("d: " + d);
    // // Nhập số int
    // System.out.println("Mời nhập vào số int e: ");
    // int e = sc.nextInt();
    // System.out.println("e: " + e);
    // // Nhập số boolean
    // System.out.println("Mời nhập vào số boolean f: ");
    // boolean f = sc.nextBoolean();
    // System.out.println("f: " + f);

    // sc.close();

    // nhập chuỗi
    System.out.println("Mời cụ nhập tên: ");
    String ten = new Scanner(System.in).nextLine();
    System.out.println("Tên cụ là: " + ten);

    System.out.println("Mời cụ nhập giới tính: ");
    String gt = new Scanner(System.in).nextLine();
    System.out.println("Giới tính cụ là: " + gt);

    System.out.println("Mời cụ nhập chiều cao: ");
    float chieu = new Scanner(System.in).nextFloat();
    System.out.println("Chiều cao cụ là: " + chieu);

  }
}
