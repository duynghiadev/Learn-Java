package bai18_forlongnhau;

public class bai18_forlongnhau {
  public static void main(String[] args) {
    // Vẽ hình không điều kiện
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        System.out.print(i + "" + j + "\t");
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");

    // Vẽ chữ N
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j == 1 || j == 7 || i == j) {
          System.out.print(i + "" + j + "\t");
        } else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");

    // Vẽ dấu *
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j == 1 || j == 7 || i == j) {
          System.out.print("*" + "\t");
        } else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");

    // Vẽ hình vuông
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j == 1 || j == 7 || i == 1 || i == 7) {
          System.out.print("*" + "\t");
        } else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");

    // Vẽ hình tam giác
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "" + j + "\t");
      }
      System.out.println("");
    }
  }
}
