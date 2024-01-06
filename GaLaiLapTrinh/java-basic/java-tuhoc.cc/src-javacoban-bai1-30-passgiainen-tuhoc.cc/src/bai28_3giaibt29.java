import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bai28_3giaibt29 {
    /*
    Viết chương trình nhập vào 1 danh sách list sau đó:
	#1. tạo ra 1 list mới bình phương các phần từ
	#2.Xác định bao nhiêu phần tử lớn hơn 50
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hỏi người dùng số lượng phần tử cần tạo
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        // Tạo một danh sách (kiểu dữ liệu các pt là số nguyên)
        ArrayList<Integer> list = new ArrayList<>();
        // cho người dùng nhập
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ "+(i+1));
            int soNhap = sc.nextInt();
            list.add(soNhap);
        }
        // In ra danh sách
        System.out.println(list);

        // 1. Tạo danh sách list mới bình phương các phần tử
        List<Integer> binhPhuongList = new ArrayList<>();
        for (int x : list) {
            binhPhuongList.add(x * x);
        }
        // In ra danh sách list mới
        System.out.println("list bphuong các phần tử: "
                                        + binhPhuongList);

        // 2. Đếm số lượng phần tử lớn hơn 50
        int count = 0;
        for (int x: binhPhuongList){
            if (x>50)
                count++;
        }
        // In ra kết quả
        System.out.println("Số lượng phần tử > 50: " + count);

    }
}
