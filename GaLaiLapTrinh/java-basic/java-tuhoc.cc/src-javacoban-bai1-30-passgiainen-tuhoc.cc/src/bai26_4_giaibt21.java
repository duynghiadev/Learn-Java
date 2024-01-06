import java.util.Scanner;

public class bai26_4_giaibt21 {
    public static void main(String[] args) {
        /*
        Viết chương trình chuyển tin nhắn sang mật mã theo bảng :
        a="abcdefghijklmnopqrstuvwxyz"
	    b="zxcvbnmasdfghjklqwertyuiop“
         */
        // Tạo bảng mã hóa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";

        // Nhập tin nhắn cần mã hóa từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tin nhắn cần mã hóa: ");
        String input = sc.nextLine();
        // Biến lưu tin nhắn sau khi đã được mã hóa
        String output = "";
        // Duyệt qua từng ký tự trong tin nhắn
        for (int i = 0; i < input.length(); i++) {
            // Lấy ra ký tự tại vị trí hiện tại
            char c = input.charAt(i);

            // Tìm vị trí của ký tự trong biến a
            int index = a.indexOf(c);
            // Nếu ký tự này không có trong biến a thì không cần mã hóa và thêm nó vào output ngay lập tức
            if (index == -1) {
                output += c;
            } else {
                // Nếu ký tự có trong biến a thì lấy ra ký tự từ biến b tại vị trí tương ứng và thêm nó vào output
                output += b.charAt(index);
            }
        }
        // In ra tin nhắn sau khi đã được mã hóa
        System.out.println("Tin nhắn sau khi đã được mã hóa: " + output);
    }
}
