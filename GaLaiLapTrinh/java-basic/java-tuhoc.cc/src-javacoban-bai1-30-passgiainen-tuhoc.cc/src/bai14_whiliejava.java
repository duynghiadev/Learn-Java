import java.util.Scanner;

public class bai14_whiliejava {
    public static void main(String[] args) {
        /*int x=0;
        while (x<=5){
            System.out.println("x= "+x);
            x++;
        }*/
        /*
        Viết chương trình nhập vào số n từ bàn phím.
        n phải nằm trong khoảng từ 1 đến 99
		Nhập sai bắt nhập lại
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên từ 1-99: ");
        int n = sc.nextInt();
        while (n<1 || n>99)
        {
            System.out.println("Nhập lại n, n chỉ được phép từ 1-99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n= "+n);
    }
}
