import java.util.Locale;
import java.util.Scanner;

public class bai10_scannerjava {
    public static void main(String[] args) {
        //cách 1: Đôi khi nhập liên tiếp chuỗi và số sẽ phát sinh lỗi
        //khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);
        //cho nhập chuỗi
        System.out.println("Mời nhập vào mật khẩu cấp 1: ");
        String mk1 =sc.nextLine();
        System.out.println("mật khẩu cấp 1 là : " +mk1);

        System.out.println("Mời nhập vào mật khẩu cấp 2: ");
        String mk2 =sc.nextLine();
        System.out.println("mật khẩu cấp 2 là : " +mk2);


        System.out.println("Mời nhập vào 1 số nguyên: ");
        int soNguyen =sc.nextInt();
        System.out.println("số nguyên bạn vừa nhập là : " +soNguyen);

        boolean check = sc.nextBoolean(); //nhập 1 giá trị kiểu bool
        double doubleValue = sc.nextDouble(); // nhập 1 gt double
        float floatValue = sc.nextFloat(); // nhập 1 gt float

        //Cách 2 khai báo riêng các đối tượng cho mỗi lần nhập
        //nhập chuỗi
        System.out.println("Mời cụ nhập tên : ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Tên cụ là: "+ten);

        //nhập số nguyên
        System.out.println("Mời cụ nhập tuổi : ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.println("Cụ đã được "+tuoi +" mùa khoai sọ");

        //nhập kiểu float
        System.out.println("Mời cụ nhập chiều cao : ");
        float chieuCao = new Scanner(System.in).nextFloat();
        System.out.println("Chiều cao cụ là: "+ chieuCao);
    }
}
