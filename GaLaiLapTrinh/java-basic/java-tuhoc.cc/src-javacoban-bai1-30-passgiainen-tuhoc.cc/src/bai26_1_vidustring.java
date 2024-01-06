import java.util.Scanner;

public class bai26_1_vidustring {
    public static void main(String[] args) {
        /*
        Nhập vào 1 chuỗi từ bàn phím ,
        đếm xem có bao nhiêu ký tự thường
         bao nhiêu in hoa
         bao nhiêu số
         bao nhiêu space
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời cụ nhập chuỗi: ");
        //đọc dữ liệu
        String s= sc.nextLine();
        //gán biến đếm
        int demSo=0;
        int demInThuong=0;
        int demInHoa=0;
        int demSpace=0;
        if (s!=""){
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) {
                    demInThuong++;
                } else if (Character.isUpperCase(c)) {
                    demInHoa++;
                } else if (Character.isDigit(c)) {
                    demSo++;
                } else if (Character.isWhitespace(c)) {
                    demSpace++;
                }
            }
            //xuất kết quả
            System.out.println("Số lượng ký tự thường: " + demInThuong);
            System.out.println("Số lượng ký tự in hoa: " + demInHoa);
            System.out.println("Số lượng ký tự số: " + demSo);
            System.out.println("Số lượng khoảng trắng: " + demSpace);
        }
        else
            System.out.println("Thím chưa nhập gì mà.");
    }
}
