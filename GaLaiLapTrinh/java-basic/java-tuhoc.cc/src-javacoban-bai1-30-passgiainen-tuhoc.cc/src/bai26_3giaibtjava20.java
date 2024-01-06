import java.util.Scanner;

public class bai26_3giaibtjava20 {
    public static void main(String[] args) {
        /*
        Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
      * mật khẩu hợp lệ khi có ít nhất 6 ký tự
      * chứa ít nhất 1 chữ cái ( chữ cái thường hoặc hoa đều được)
      * chứa ít nhất 1 chữ số
        2. cho người dùng nhập vào mật khẩu để login / so sánh, nếu đúng mở của,
        sai quá  5 lần khóa đăng nhập, thoát chương trình
         */
        Scanner sc = new Scanner(System.in);
        String password="";
        //1. mời thiết lập mật khẩu và kiểm tra tính hợp lệ
        while (true) {
            // Nhập mật khẩu mới từ người dùng
            System.out.println("Mời thiết lâp mật khẩu ");
            System.out.println("Mật khẩu ít nhất 6 ký tự, ít nhất 1 chữ cái, ít nhất 1 số: ");
            String newPassword = sc.nextLine();

            // Kiểm tra tính hợp lệ của mật khẩu mới
            if (checkMK(newPassword)) {
                // Nếu mật khẩu hợp lệ, lưu lại mật khẩu mới
                password = newPassword;
                System.out.println("Mật khẩu mới đã được cài đặt thành công.");
                break;
            } else {
                System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại.");
            }
        }


        //2. Cho nguời dùng nhập mk để login
        //Số lần người dùng nhập sai mật khẩu
        int count = 0;
        String login = "";
        while (true){
            // Nhập mật khẩu từ người dùng
            System.out.println("Mời nhập mk login: ");
            login = sc.nextLine();
            //kiểm tra mk có khơp k?
            if (login.equals(password)){
                System.out.println("Đăng nhập thành công");
                break;
            }
            else {
                System.out.println("MK không đúng, vui lòng nhập lại còn "+(5-count) +"lần thử " );
                count++;
            }
            //nếu đếm =5 , thì thoát ctrinh
            if (count==5)
            {
                System.out.println("bạn đã nhập sai 5 lần, đăng nhập bị khoá");
                break;
            }
        }
    }

    public static boolean checkMK(String password) {
        // Kiểm tra độ dài mật khẩu
        if (password.length() < 6) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất 1 chữ cái hay không
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) {
            return false;
        }
        // Kiểm tra xem mật khẩu có chứa ít nhất 1 chữ số hay không
        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber) {
            return false;
        }
        // Nếu mật khẩu đủ độ dài, chứa ít nhất 1 chữ cái và ít nhất 1 chữ số, thì trả về true
        return true;
    }

}
