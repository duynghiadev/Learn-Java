package bai12_toantu3ngoi;

import java.util.Scanner;

public class bai12_1giaibt10 {
  public static void main(String[] args) {
    /**
     * Viết chương trình nhập vào điểm trung bình, và kết quả xếp loại của học sinh theo tiêu 
     * chuẩn sau:
     * Yêu cầu: dùng toán tử 3 ngôi
     *
     * Giỏi: nếu điểm >= 8
     * Khá: nếu điểm < 8 và điểm >= 6.5
     * Trung bình: nếu điểm < 6.5 và điểm >= 5
     * Yếu: nếu điểm < 5
     *
     * Nếu nhập điểm lớn hơn 10 thì in ra "Nhập điểm tào lao"
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào điểm trung bình: ");
    double dtb = sc.nextDouble();

    // xử lý lệnh tính toán
    String traLoi = (dtb > 10) ? "Nhập điểm tào lao" : (dtb >= 8 && dtb < 10) ? "Giỏi" :
        (dtb < 8 && dtb >= 6.5) ? "Khá" : (dtb < 6.5 && dtb >= 5) ? "Trung Bình" : "Yếu";

    System.out.println("Học sinh có học lực: " + traLoi);
  }
}
