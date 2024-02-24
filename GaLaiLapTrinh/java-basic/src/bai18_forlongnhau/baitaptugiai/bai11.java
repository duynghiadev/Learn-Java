package bai18_forlongnhau.baitaptugiai;

public class bai11 {
  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 4; j++) {
        if ((i >= j) && ((i - j) <= 3)) {
          System.out.print("*" + "  ");
        } else {
          System.out.print(" " + "  ");
        }
      }
      System.out.println("");
    }
  }
}
