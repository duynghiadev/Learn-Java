import java.util.Scanner;

public class bai13_2btjava11 {/*
   Bài tập Java 11:  Áp dụng switch case
    Viết chương trình khung tìm kiếm: cho người dùng nhập vào lựa chọn
    1. tìm theo tên
    2. tìm theo tác giả
    3. tìm theo nhà xuất bản
    4. tìm theo tiêu đề
    Thoát nếu phím bấm không hợp lệ
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn: ");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà xuất bản");
        System.out.println("4. tìm theo tiêu đề");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("tìm theo tác giả");
                break;
            case 3:
                System.out.println("tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("tìm theo tiêu đề");
                break;
            default:
                System.out.println("phím bấm 0 hợp lệ");
                break;
        }

    }
}

