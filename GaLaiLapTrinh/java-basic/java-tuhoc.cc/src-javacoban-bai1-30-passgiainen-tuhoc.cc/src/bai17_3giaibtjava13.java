import java.util.Scanner;

public class bai17_3giaibtjava13 {
    /*
    Bài tập Java 13:
       Viết chương trình nhập nhập số a từ bàn phím,
    Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a
    Nếu a lẻ thì in ra dòng chữ “tôi o tính tổng số lẻ, bye bye ” và thoát chương trình
     */
    public static void main(String[] args) {
        int a;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên a: ");
        a = sc.nextInt();
        if (a % 2 != 0)
        {
            System.out.println("Tôi không tính tổng các số lẻ, bye bye..");
        }
        else
        {
            for (int i = 0; i <= a; i+=2)
            {
                tong = tong + i; //tong+=i
            }
            System.out.println("Tổng các số chẵn từ 0 đến "+a +"= "+tong);
        }
    }
}
