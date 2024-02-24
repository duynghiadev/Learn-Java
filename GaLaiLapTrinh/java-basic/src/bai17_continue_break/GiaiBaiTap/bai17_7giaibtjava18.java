package bai17_continue_break.GiaiBaiTap;

import java.util.Scanner;

public class bai17_7giaibtjava18 {
  /**
   * Viết chương trình nhập số nguyên a > 0 từ bàn phím. Cho biết đó có phải là số nguyên tố ?
   * - Số nguyên tố là số lớn hơn 1, và chỉ chia hết cho 1 và chính nó
   * - Kết thúc chương trình -> Hỏi người dùng: Bạn có muốn sử dụng phần mềm không ?
   * - Nếu chọn không thì thoát chương trình lun - Còn chọn có thì tiếp tục sử dụng
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Mời nhập vào 1 số nguyên a > 0: ");
      int a = sc.nextInt();

      // check điều kiện đảm bảo người dùng nhập số nguyên a > 0
      while (a <= 0) {
        System.out.println("Nhập lại a, a phải lớn hơn 0: ");
        a = sc.nextInt();
      }
      System.out.println("Bạn đã nhập a thành công, a = " + a);

      // Kiểm tra số nguyên tố (Số nguyên tố là số chỉ có 2 ước số)
      int demUoc = 0;
      for (int i = 1; i <= a; i++) {
        if (a % i == 0) {
          demUoc++;
        }
      }
      if (demUoc == 2) {
        System.out.println(a + " là số nguyên tố");
      } else {
        System.out.println(a + " không phải là số nguyên tố");
      }

      System.out.println("Bạn có muốn thoát không ? Chọn 1 để tiếp tục, Chọn 2 để thoát.");
      int option = sc.nextInt();
      if (option == 2) {
        System.out.println("Chương trình kết thúc.");
        break;
      } else if (option != 1) {
        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
      }
    }
  }
}
