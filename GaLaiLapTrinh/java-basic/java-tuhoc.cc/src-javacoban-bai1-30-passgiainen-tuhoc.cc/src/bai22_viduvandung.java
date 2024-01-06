import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào ngày, tháng, năm sinh.
        Cho biết số tuổi và in ra màn hình
         */
        int day, month, year, tuoi;
        //nhập liệu từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("nhập ngày sinh: ");
        day = input.nextInt();
        System.out.print("nhập tháng sinh: ");
        month = input.nextInt();
        System.out.print("nhập năm sinh: ");
        year = input.nextInt();

        Calendar birthday = Calendar.getInstance();
        //do tháng chạy từ 0-11 nên cần trừ đi 1
        birthday.set(year, month - 1, day);
        //xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngày tháng năm sinh: "
                +ngaySinh+"/"
                +(thangSinh+1)+"/"
                +namSinh);
        //tính tuổi
        //năm hiện tại
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        //tuổi = namHienTai - namSinh
        tuoi= namHienTai-namSinh ;
        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}
