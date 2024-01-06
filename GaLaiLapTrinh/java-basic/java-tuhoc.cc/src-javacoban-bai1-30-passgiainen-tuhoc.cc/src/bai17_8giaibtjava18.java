import java.util.Scanner;

public class bai17_8giaibtjava18 {
    /*
    Bài tập java 18:
    Viết chương trình nhập nhập số nguyên a> 0 từ bàn phím
    Cho biết đó có phải số ng tố
    ( số ng tố là số >1, và chỉ chia hết cho 1 và chính nó )
    Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không?
    Nếu chọn không thì thoát ctrinh
    */
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên a >0 : ");
        a = sc.nextInt();
        //Check điều kiện đảm bảo người dùng nhập vào số nguyên a >0
        while (a<=0)
        {
            System.out.println("nhập lại a, a phải >0  : ");
            a = sc.nextInt();
        }
        System.out.println("bạn đã nhập a =" +a);
        //kiểm tra số nguyên tố (Số nguyên tố là số chỉ có đúng 2 ước)
        int demUoc = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
                demUoc++;
        }
        if (demUoc == 2)
            System.out.println(a+ "là số nguyên tố");
        else
            System.out.println(a+ "{không phải là số nguyên tố");
    }
}
