package bai12_toantu3ngoi;

import java.util.Scanner;

public class baitap10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double avgScore;

    System.out.println("Vui lòng nhập vào điểm trung bình của bạn: ");
    avgScore = input.nextDouble(); // Nhập Điểm Trung Bình

    // Kiểm tra toán tử bằng toán tử 3 ngôi
    String resCheck = (avgScore <= 10 && avgScore >= 8) ? "Giỏi" :
        ((avgScore < 8 && avgScore >= 6.5) ? "Khá" :
            (avgScore < 6.5 && avgScore >= 5) ? "Trung Bình" :
                (avgScore < 5 && avgScore >= 1) ? "Yếu" : "Không xác định dược điểm");

    System.out.println("Điểm trung bình của bạn đạt loại: " + resCheck);
  }
}
