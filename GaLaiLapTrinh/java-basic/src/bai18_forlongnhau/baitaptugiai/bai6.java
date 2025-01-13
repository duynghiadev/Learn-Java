package bai18_forlongnhau.baitaptugiai;

public class bai6 {
  public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        if (i == 3 && j == 2) {
          System.out.print(" " + "  ");
        } else {
          System.out.print("*" + "  ");
        }
      }
      System.out.println("");
    }
  }
}
