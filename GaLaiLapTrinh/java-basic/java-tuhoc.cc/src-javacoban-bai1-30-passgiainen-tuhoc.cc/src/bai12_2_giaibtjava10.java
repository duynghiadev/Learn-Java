import java.util.Scanner;

public class bai12_2_giaibtjava10 {
    /*
    Viết chương trình nhập vào điểm trung bình,
    và kết quả xếp loại của học sinh theo tiêu chuẩn sau: ( dùng toán tử 3 ngôi )
     Giỏi: Nếu Điểm >= 8
     Khá: Nếu 8 > Điểm >= 6.5
     Trung bình: Nếu 6.5 > Điểm >= 5
     Yếu: Nếu Điểm < 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào dtb: ");
        double dtb= sc.nextDouble();
        String traloi = (dtb>=8)? "Giỏi" :
                ((dtb<8 && dtb >=6.5)? "Khá" :
                        (dtb>=5 && dtb<6.5)?" Trung Bình" :"Yếu");
        System.out.println(traloi);
    }
}
