import java.util.Scanner;

public class bai17_7giaibtjava17 {
    /*
       Bài tập java 17:
       số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó
       ví dụ : 6 = 1+2+3
       Tìm tất cả những số hoàn thiện trong phạm vi từ 1-1000
     */
    public static void main(String[] args) {
        //kiểm tra 1 số có phải hoàn hảo
//        int n;
//        int tong = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("mời nhập vào số nguyên n: ");
//        n= sc.nextInt();
//        for (int i = 1; i < n; i++)
//        {
//            if (n % i == 0)
//                tong = tong + i;
//        }
//        if (tong == n)
//            System.out.println(n+ " là số hoàn hảo");
//        else
//            System.out.println(n+ " không phải là số hoàn hảo");

        // tìm số hoàn hảo trong phạm vi từ 1-1000
        for (int n = 1; n <=1000; n++)
        {
            int tong = 0;
            for (int i = 1; i < n; i++)
            {
                if (n % i == 0)
                    tong = tong + i;
            }
            if (tong == n)
                //System.out.println(n+ " là số hoàn hảo");
                System.out.print(n + " ");
        }
    }
}
