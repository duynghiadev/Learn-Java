import java.util.Scanner;

public class bai17_4giaibtjava14 {
    public static void main(String[] args) {
     /*    Bài tập Java 14
      Viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
        1.Nhập n = 7, Bỏ qua cộng tổng với số 3 => in ra kết quả
            (gợi ý đáp án : 1+5+7 =13)
        2.Thử break khi vòng lặp chạy đến giá trị n=3
     */
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số ngyên n: ");
        n = sc.nextInt();
        if (n%2 !=0){
            for (int i=1;i<=n;i+=2){
                if (i==3)
                    break;
                else
                    tong+=i;
            }
            System.out.println("Tổng các số lẻ từ 1 đến " +n +"= "+tong);
        }

    }
}
