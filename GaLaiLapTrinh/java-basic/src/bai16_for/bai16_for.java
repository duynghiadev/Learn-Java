package bai16_for;

public class bai16_for {
  public static void main(String[] args) {
    for (int i = 0; i < 12; i += 2) {
      System.out.println("i:" + i);
    }
    // tính tổng các số chẳn từ 0-10
    int tong = 0;
    for (int i = 0; i <= 10; i++) {
      tong += i;// tong = tong +i
    }
    System.out.println("Tổng:" + tong);
  }
}
