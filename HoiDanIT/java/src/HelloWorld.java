import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int c = Math.max(a, b);
        System.out.println("Max = " + c);
        int d = Math.min(a, b);
        System.out.println("Min = " + d);

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: " + Math.pow(2, 3)); // 2 mũ 3
        int firstNumber = scanner.nextInt();

        System.out.println("Second number: " + Math.sqrt(49)); // căn bậc 2
        int secondNumber = scanner.nextInt();

        System.out.println("Min =  " + Math.min(firstNumber, secondNumber));
        System.out.println("Max =  " + Math.max(firstNumber, secondNumber));
        scanner.close();
    }
}
