package bai18_forlongnhau.baitaptugiai;

public class bai8 {
  public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= 4; j++) {
        if ((i > j) || (i == 2 && j == 3)) {
          System.out.print(" " + "  ");
        } else {
          System.out.print("*" + "  ");
        }
      }
      System.out.println("");
    }
  }
}
