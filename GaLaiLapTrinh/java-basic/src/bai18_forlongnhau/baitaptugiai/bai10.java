package bai18_forlongnhau.baitaptugiai;

public class bai10 {
  public static void main(String[] args) {
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= 7; j++) {
        if (i <= j && (i + j <= 8)) {
          if ((i == 3 && j == 4) || (i == 2 && j == 3) || (i == 2 && j == 4) || (i == 2 && j == 5)) {
            System.out.print(" " + "  ");
          } else {
            System.out.print("*" + "  ");
          }
        } else {
          System.out.print(" " + "  ");
        }
      }
      System.out.println("");
    }
  }
}
