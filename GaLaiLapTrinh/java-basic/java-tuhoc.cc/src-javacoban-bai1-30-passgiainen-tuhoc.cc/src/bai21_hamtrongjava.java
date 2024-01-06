import java.util.Scanner;

public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = cong(8,2);
        int kq2 = cong(9,5);
        System.out.println("tổng = "+kq);
        System.out.println("tổng = "+kq2);
        //test hàm xin chào
        xinChao("female");
    }

    // Hàm có kiểu trả về int
    public static int cong(int x, int y) {
        return x + y;
    }

    // Hàm không có kiểu trả về
    public static void xinChao(String gioitinh) {
        if (gioitinh.equals("female"))
            System.out.println("Xin chào, tôi là nhân viên nữ");
        else if (gioitinh.equals("male"))
            System.out.println("Xin chào, tôi là nhân viên nam");
    }
}
