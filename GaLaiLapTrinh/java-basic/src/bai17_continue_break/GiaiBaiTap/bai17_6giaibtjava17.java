package bai17_continue_break.GiaiBaiTap;

public class bai17_6giaibtjava17 {
  /**
   * Bài tập Java 17:
   * - Số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó
   * - Ví dụ: 6 = 1 + 2 + 3
   * - Tìm tất cả những số hoàn thiện trong phạm vi từ 1 -> 1000
   */
  // Kiểm tra xem 1 số có phải là số hoàn hảo hay không ?
  public static void main(String[] args) {
    // Example for a single number
    int n = 6;
    if (isPerfectNumber(n)) {
      System.out.println(n + " là số hoàn hảo");
    } else {
      System.out.println(n + " không phải là số hoàn hảo");
    }
    System.out.println("----------------------------------------");

    // Finding perfect numbers in the range from 1 to 10000
    findPerfectNumbersInRange(1, 10000);
  }

  // Function to check if a number is a perfect number
  public static boolean isPerfectNumber(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == num;
  }

  // Function to find and print perfect numbers in a given range
  public static void findPerfectNumbersInRange(int start, int end) {
    for (int m = start; m <= end; m++) {
      if (isPerfectNumber(m)) {
        System.out.println(m + " là số hoàn hảo");
      }
    }
  }
}
