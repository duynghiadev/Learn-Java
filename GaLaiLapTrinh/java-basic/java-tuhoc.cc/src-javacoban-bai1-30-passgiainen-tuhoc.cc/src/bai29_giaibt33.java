import java.util.HashMap;
import java.util.Scanner;

public class bai29_giaibt33 {
    public static void main(String[] args) {
        /*
        Viết chương trình sử dụng dict chứa 10 user name và password.
        Chương trình yêu cầu nhập vào username và pass,
        nếu user name o có trong dict, chương trình báo user name o tồn tại
        nếu user name đúng mà password sai thì báo : PASSWORD SAI
        nếu user, pass đúng thì báo bạn đã login thành công
         */
        // Tạo một HashMap chứa các thông tin username và password
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "123456");
        users.put("user3", "123456");
        users.put("user4", "123456");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập username: ");
        String username = sc.nextLine();
        System.out.print("Nhập password: ");
        String password = sc.nextLine();

        if (!users.containsKey(username)) {
            // Nếu username không tồn tại trong HashMap
            System.out.println("Username không tồn tại.");
        } else if (!users.get(username).equals(password)) {
            // Nếu username tồn tại nhưng password sai
            System.out.println("Password sai.");
        } else {
            // Nếu username và password đúng
            System.out.println("Bạn đã đăng nhập thành công.");
        }
    }
}
