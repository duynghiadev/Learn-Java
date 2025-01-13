package bai8_toantugan;

public class batap_toantugan {
  public static void main(String[] args) {
    int a = 6;
    int a1 = 6;
    int a2 = 6;
    int a3 = 6;
    int a4 = 6;

    System.out.println("a1 = " + (a1 += 3));
    System.out.println("a2 = " + (a2 -= 5));
    System.out.println("a3 = " + (a3 *= 2));
    System.out.println("a4 = " + (a4 %= 5));

    int b = 2;

    System.out.println("a=a-(b+7) = " + (a -= (b + 7)));
  }
}
