import java.util.Scanner;

public class bai17_2giaibtjava12 {
    /*java12:
    Viết chương trình nhập vào số nguyên n, in ra kết quả n!
    Dùng vòng lặp for
    Dùng vòng lặp while
     */
    //for
    //ví dụ : 3! = 1*2*3
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời cụ nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int gt =1;
        //tính n giai thừa
        for (int i = 1; i<= n;i++)
        {
            gt = gt * i; // gt*=i
        }
        System.out.println("kết quả "+n +"!= " +gt);*/

        //while
        int n, i=1;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên n: ");
        n = sc.nextInt();
        //tính n giai thừa
        while (i <= n)
        {
            gt = gt * i; //gt*=i;
            i++;
        }
        System.out.println("kết quả "+n +"!= " +gt);
    }


}
