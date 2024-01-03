package bai6_epkieudulieu;

public class bai6_epkieudulieu {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    double kq = (double) a / b; // ép kiểu int -> double: Được gọi là ép kiểu rộng
    System.out.println(kq);

    // Đây là ép kiểu hẹp
    int c = 128;
    // byte nó chỉ lưu trữ được tối đa 127. Nên trường hợp này không thể ép kiểu
    // được. Do biến c vượt quá 127 kí tự
    byte d = (byte) c;
    System.out.println(c);
    System.out.println(d);

    int e = 15;
    // Trường hợp này thì ép kiểu được, cho nên không bị mất dữ liệu. Vì biến e dưới
    // 127 kí tự
    byte f = (byte) e;
    System.out.println(e);
    System.out.println(f);
  }
}
