import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();
        if (dtb>=5.0)
        {
            System.out.println("Bạn đỗ");
        }
        else
        {
            System.out.println("Bạn đã tạch");
        }
        System.out.println("Cảm ơn bạn đã dùng phần mềm");*/

    /*
    Nhập vào điểm tb, in ra xếp loại của học sinh
    giỏi : dtb<=10 và dtb >=8
    khá : 8>dtb >=6.5
    Tb : 6.5 > dtb >=5
    Yếu: dtb<5
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào dtb: ");
        double dtb = sc.nextDouble();
        //ktra điều kiện
        if (dtb<=10 && dtb >=8)
            System.out.println("Bạn xl giỏi");
        else if (dtb<8 && dtb>=6.5)
            System.out.println("Bạn xl khá");
        else if (dtb<6.5 && dtb >=5)
            System.out.println("Bạn xl TB");
        else
            System.out.println("Bạn xl yếu");
    }


}
