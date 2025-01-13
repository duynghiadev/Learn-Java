package bai18_forlongnhau.baitaptugiai;

public class bai9 {
  public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= 7; j++) {
        if (i <= j && (i + j <= 8)) {
          System.out.print("*" + "  ");
        } else {
          System.out.print(" " + "  ");
        }
      }
      System.out.println("");
    }
  }
}
