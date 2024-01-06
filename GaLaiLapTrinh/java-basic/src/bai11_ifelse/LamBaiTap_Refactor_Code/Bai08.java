package LamBaiTap_Refactor_Code;


import java.util.Scanner;

public class Bai08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập số a: ");
    double a = sc.nextDouble();
    System.out.println("Nhập vào số b: ");
    double b = sc.nextDouble();
    System.out.println("Nhập vào số c: ");
    double c = sc.nextDouble();

    double delta = calculateDelta(a, b, c);
    double[] solutions = calculateSolutions(a, b, delta);

    System.out.printf("Phương trình: %.2fx^2 + %.2fx + %.2f\n", a, b, c);
    System.out.printf("Delta = %.2f\n", delta);

    displayResults(delta, solutions);

    // Log solutions
    System.out.println("Solutions:");
    for (int i = 0; i < solutions.length; i++) {
      System.out.printf("x%d = %.2f\n", i + 1, solutions[i]);
    }
  }

  private static double calculateDelta(double a, double b, double c) {
    return Math.pow(b, 2) - 4 * a * c;
  }

  private static double[] calculateSolutions(double a, double b, double delta) {
    double[] solutions = new double[2];


    if (delta > 0) {
      solutions[0] = (-b + Math.sqrt(delta)) / (2 * a);
      solutions[1] = (-b - Math.sqrt(delta)) / (2 * a);
    }

    return solutions;
  }

  private static void displayResults(double delta, double[] solutions) {
    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm");
    } else if (delta == 0) {
      System.out.println("Phương trình có nghiệm kép x1 = x2: " + solutions[0]);
    } else {
      System.out.println("Phương trình có 2 nghiệm phân biệt: ");
      System.out.println("x1 = " + solutions[0]);
      System.out.println("x2 = " + solutions[1]);
    }
  }
}
