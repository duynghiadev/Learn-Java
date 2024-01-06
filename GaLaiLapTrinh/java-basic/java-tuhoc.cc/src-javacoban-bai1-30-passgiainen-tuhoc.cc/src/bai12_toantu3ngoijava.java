import java.util.Scanner;

public class bai12_toantu3ngoijava {
    public static void main(String[] args) {
        //nhập vào bàn phím 1 số, ktra chẵn lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời thím nhập vào số nguyên n: ");
        int n = sc.nextInt();
        String traloi = (n%2==0) ?"Chẵn" : "Lẻ";
        System.out.println(traloi);
    }
}
