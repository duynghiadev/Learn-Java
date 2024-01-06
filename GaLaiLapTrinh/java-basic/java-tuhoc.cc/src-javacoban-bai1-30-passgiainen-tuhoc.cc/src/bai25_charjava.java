import java.util.Scanner;

public class bai25_charjava {
    public static void main(String[] args) {
        char ch = 'x'; // khởi tạo (có gán giá trị)
        char ch2 = 65; // khởi tạo (dùng mã ASII)
        char ch3 ; // khai báo biến (0 gán giá trị)
        System.out.println(ch2); // trả về A
        //ép kiểu char cho dữ liệu nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 ký tự: ");
        //đọc dữ liệu từ bàn phím
        String input = sc.nextLine();
        char ch4 = input.charAt(0);//lấy 1 ký tự đầu
        System.out.println("Ký tự vừa nhập: " + ch4);

        //3. compareTo: So sánh 2 ký tự => trả về 1 số nguyên:
        //1. ký tự giống nhau trả về 0
        System.out.println(Character.compare('a','a'));
        //2. ký tự 1 trước 2 trong bảng ASII trả về số âm < 0
        //A: 65 , a: 97 => 65-97 = -32
        System.out.println(Character.compare('A','a'));
        //3. ký tự 1 sau 2 trong bảng ASII trả về số dương >0
        //a: 97, A: 65 => 97-65 = 32
        System.out.println(Character.compare('a','A'));


        //char method
        char ch5 ='1';
        char ch6 ='a';
        char ch7 ='A';
        char ch8 =' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));

    }
}
