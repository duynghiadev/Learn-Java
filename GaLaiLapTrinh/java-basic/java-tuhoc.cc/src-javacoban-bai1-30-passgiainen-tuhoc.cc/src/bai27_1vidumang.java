import java.util.Arrays;
import java.util.Scanner;

public class bai27_1vidumang {
    public static void main(String[] args) {
        /* ví dụ mảng
        Viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên
	 có n phần tử, n do người dùng nhập từ bàn phím
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số pt tối đa của mảng: ");
        int n = sc.nextInt();
        // tạo mảng có n phần tử ( cấp phát bộ nhớ cho mảng)
        int[] M = new int[n];
        //cập nhật dữ liệu cho từng phần tử
        for (int i=0; i<M.length; i++){
            System.out.println("M["+i+"]= ");
            M[i] = sc.nextInt();
        }
        //xuất mảng ( chỉ dùng để xem)
        System.out.println("mảng M được tạo là");
        System.out.println(Arrays.toString(M));
    }
}
