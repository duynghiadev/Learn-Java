package chapter4;

public class Video23 {

  int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Video23 test = new Video23();
    int a = test.sum(6, 9);
    System.out.println("check sum = " + a);
  }
}
