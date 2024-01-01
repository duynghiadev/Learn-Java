package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số lượng phần tử của array: ");
    int size = scanner.nextInt();
    int[] a = new int[size];
    System.out.print("Nhập phần tử: ");
    // For reading element
    for (int i = 0; i < size; i++) {
      a[i] = scanner.nextInt();
    }
    System.out.println("Array ban đầu: " + Arrays.toString(a));
    // Arrays.sort(a);
    // System.out.println("Array sắp xếp: " + Arrays.toString(a));
    // System.out.println("max: " + a[a.length - 1]);
    // System.out.println("min: " + a[0]);

    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[i]: " + a[i] + " and max[0]: " + max);
      if (a[i] > max) {
        max = Math.max(max, a[i]);
      }
    }
    System.out.println("=> Result max: " + max);
    System.out.println("==============================");

    System.out.println("Array ban đầu: " + Arrays.toString(a));

    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[i]: " + a[i] + " and min[0]: " + min);
      if (a[i] < min) {
        min = Math.min(min, a[i]);
      }
    }
    System.out.println("=> Result min: " + min);
    System.out.println("==============================");

    scanner.close();
  }
}
