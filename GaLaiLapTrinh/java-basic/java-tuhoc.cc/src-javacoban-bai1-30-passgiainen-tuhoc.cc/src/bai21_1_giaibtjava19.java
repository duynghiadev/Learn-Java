import java.util.Scanner;

public class bai21_1_giaibtjava19 {
    /*
    Viết chương trình nhập vào từ bàn phím 2 số a, b
      Nhập 1 ký tự  +, - , * , /
      Dùng function
	1 . Nếu nhập + : Tính a+b và in ra kết quả
	2.  Nếu nhập - : Tính a-b và in ra kết quả
	3. Nếu nhập * : Tính a*b và in ra kết quả
	4. Nếu nhập / : Tính a/b và in ra kết quả ( chú ý ktra mẫu số khác 0)
     */
    public static void main(String[] args) {
        //cho người dùng nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào b: ");
        double b = sc.nextDouble();
        //khởi tạo biến scaner mới để đọc chuỗi
        Scanner scString = new Scanner(System.in);
        System.out.println("mời chọn phép tính: + - * /");
        String phepTinh = scString.nextLine();
        switch (phepTinh){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Phím bấm không hợp lệ");
                break;
        }
    }
    //hàm cộng
    public static void cong(double a, double b){
        double kq=a+b;
        System.out.println("kq = "+kq);
    }
    //hàm trừ
    public static void tru(double a, double b){
        double kq=a-b;
        System.out.println("kq = "+kq);
    }
    //hàm nhân
    public static void nhan(double a, double b){
        double kq=a*b;
        System.out.println("kq = "+kq);
    }
    //hàm trừ
    public static void chia(double a, double b){
        if (b==0)
            System.out.println("0 làm sao chia má ơi!");
        else {
            double kq=a/b;
            System.out.println(a+" * "+b+" = "+kq);
        }
    }
}
