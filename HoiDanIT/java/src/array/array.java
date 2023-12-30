package array;

import java.util.Arrays;

public class array {
  public static void main(String[] args) {
    String[] club = { "Ronaldo", "Messi", "Neymar" };
    club[0] = "Arsenal";

    String[] a = new String[5];
    a[0] = "1";

    System.out.println("run array a[0] " + a[0]);

    System.out.println("run here array with length: " + club.length);
    System.out.println("run here array with length[0]: " + club[0]);
    System.out.println("run here array " + Arrays.toString(club));

    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}
