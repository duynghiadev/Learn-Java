package bai9_toantulogic;

public class bai9_toantulogic {
  public static void main(String[] args) {
    int i = 7;
    // kiểm tra giá trị i > 0 và i < 10 không
    if (i > 0 && i < 10) {
      System.out.println("i > 0 và i < 10");
    } else {
      System.out.println("i <= 0 hoặc i >= 10");
    }
    // kiểm tra giá trị i > 0 hoặc i < 10 không
    if (i > 0 || i < 10) {
      System.out.println("i > 0 hoặc i < 10");
    } else {
      System.out.println("i <= 0 hoặc i >= 10");
    }

    // toán tử tiền tố và hậu tố ++
    i++;
    System.out.println(i);
    // toán tử tiền tố và hậu tố --
    i--;
    System.out.println(i);

    System.out.println("-----------------------");

    int a = 1;
    int b = 2;
    int c = a++ - ++b + 1;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c); // Phần này hơi khó hiểu. Có ảnh giải thích bên file markdown
  }
}
