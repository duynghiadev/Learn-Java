import java.util.Scanner;

public class bai17_continue_breakjava {
    public static void main(String[] args) {
        //tính tổng từ 1 đến 5 trừ số 3
        int tong =0;
        for (int i=0;i<=5;i++){
            if (i==3)
                continue; //bỏ qua i=3
            else
            {
                System.out.println("i= "+i);
                tong+=i;
            }
        }
        System.out.println("tong = " +tong);

        //ví dụ 2
        int n=0;
        while (n<100){
            n++; //tăng n lên 1
            System.out.println("n trong vòng lặp = "+n);
            if (n==4)
                break;
        }
        System.out.println("Giá trị n cuối cùng = "+n);
    }
}
