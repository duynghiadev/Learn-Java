import java.util.Scanner;

public class bai26_8giaibt25_daypanlyndrome {
    public static void main(String[] args) {
        /*
        Viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome
        ( là chuỗi có đảo ngược cũng bằng chính nó, ví dụ madam, radar …)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = sc.nextLine();

        // Đảo ngược chuỗi
        String reverseStr = new StringBuilder(str).reverse().toString();

        // So sánh chuỗi với chuỗi đảo ngược để kiểm tra xem có phải là panlyndrome hay không
        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println("Đây là một chuỗi panlyndrome.");
        } else {
            System.out.println("Đây không phải là một chuỗi panlyndrome.");
        }
    }
}
