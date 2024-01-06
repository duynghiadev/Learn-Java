import java.util.Scanner;

public class bai19_loitrongjava {
    public static void main(String[] args) {
        /*int x=5
        int 1convit = 9;*/
        //test lỗi runtime
        /*int x= 5;
        int y = 2/x;
        int z= 6/y;
        System.out.println(z);
        System.out.println("Đoạn code phía sau");*/

        //giải phương trình bậc nhất bằng java, ax + b=0
        Scanner scanner = new Scanner(System.in);
        // Nhập hệ số a và b từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        // Kiểm tra trường hợp a = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm của phương trình
            double x = b / a; // đúng phải là -b/a
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }
}
