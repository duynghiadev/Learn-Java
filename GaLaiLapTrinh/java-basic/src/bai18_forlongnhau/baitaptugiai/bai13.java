package bai18_forlongnhau.baitaptugiai;

public class bai13 {
  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (i == 4 || (i <= 4 && i >= j) || (i >= 4 && j >= i)) {
          System.out.print("*" + "  ");
        } else {
          System.out.print(" " + "  ");
        }
      }
      System.out.println("");
    }
  }
}
