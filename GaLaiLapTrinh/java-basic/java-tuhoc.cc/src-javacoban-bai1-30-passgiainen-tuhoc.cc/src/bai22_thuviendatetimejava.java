import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_thuviendatetimejava {
    public static void main(String[] args) {
        //get toàn bộ thông tin ngày tháng năm, giờ....
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //get năm, tháng,ngày
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("năm hiện tại: "+nam);
        System.out.println("tháng hiện tại: "+(thang+1));
        //chú ý tháng luôn chạy từ 0-11 (nên phải + thêm 1)
        System.out.println("ngày hiện tại: " +ngay);

        //3.đặt ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR,1987);
        cal.set(Calendar.MONTH,7);
        cal.set(Calendar.DAY_OF_MONTH,15);
        //kiểm tra năm tháng sau khi thay đổi
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngày tháng năm sinh: "
                +ngaySinh+"/"
                +(thangSinh+1)+"/"
                +namSinh);

        //4. xuất theo định dạng ngày tháng năm
        // Tạo một đối tượng SimpleDateFormat với chuỗi định dạng dd/MM/yyyy
        //cần import java.text.SimpleDateFormat;
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // Tạo một đối tượng Date get thời gian biến cal truớc đó (ngày tháng năm sinh)
        Date date = cal.getTime();
        // Chuyển đổi ngày thành chuỗi định dạng dd/MM/yyyy và in ra màn hình
        String formattedDate = dinhDang.format(date);
        System.out.println(formattedDate);
    }
}
