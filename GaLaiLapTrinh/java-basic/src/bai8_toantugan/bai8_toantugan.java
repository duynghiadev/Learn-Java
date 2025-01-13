package bai8_toantugan;

public class bai8_toantugan {
  public static void main(String[] args) {
    // gán cộng
    int a = 8;
    a += 8;
    System.out.println(a);
    // gán trừ
    a -= 8;
    System.out.println(a);
    // gán nhân
    a *= 8;
    System.out.println(a);
    // gán chia lấy kết quả
    a /= 8;
    System.out.println((double) a);
    // gán chia lấy dư
    a %= 8;
    System.out.println(a);

    System.out.println("--------------------------");

    // toán tử so sánh
    int b = 7;
    int c = 8;
    System.out.println(b > c);
    System.out.println(b >= c);
    System.out.println(b < c);
    System.out.println(b <= c);
    System.out.println(b == c);
    System.out.println(b != c);
  }
}
