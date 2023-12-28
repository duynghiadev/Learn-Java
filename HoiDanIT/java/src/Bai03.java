import java.util.Scanner;

public class Bai03 {
  public static void main(String[] args) {
    System.out.println(">> SELECT FEATURE <<");
    System.out.println("++ ------------------ ++");
    System.out.println("| 1. Addition |");
    System.out.println("| 2. Subtract |");
    System.out.println("| 3. Finished |");
    System.out.println("++ ------------------ ++");
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    switch (value) {
      case 1:
        System.out.println("Your select is addition");
        break;
      case 2:
        System.out.println("Your select is subtract");
        break;
      default:
        System.out.println("Your select finished programming");
        System.exit(0);
    }
    scanner.close();
  }
}
