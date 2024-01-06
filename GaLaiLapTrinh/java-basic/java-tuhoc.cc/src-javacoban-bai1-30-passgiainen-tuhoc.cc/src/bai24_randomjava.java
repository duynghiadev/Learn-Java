import java.util.Random;

public class bai24_randomjava {
    public static void main(String[] args) {
        // khởi tạo đối tượng ngẫu nhiên
        Random rd = new Random();
        //1. ngẫu nhiên số nguyên
        //lấy ngẫu nhiên từ a đến sát b ( <b)
        int ngauNhien = rd.nextInt(-50,50); //chạy từ -50 đến 49
        System.out.println(ngauNhien);
        //nếu a không nhập, thì sẽ chạy từ 0
        int ngauNhien2 = rd.nextInt(50); //chạy từ 0 đến 49
        System.out.println(ngauNhien2);

        //2.ngẫu nhiên số thực
        //chạy ngẫu nhiên từ -100 đến sát 1
        double x= rd.nextDouble(-100,100);
        System.out.println(x);
    }
}
