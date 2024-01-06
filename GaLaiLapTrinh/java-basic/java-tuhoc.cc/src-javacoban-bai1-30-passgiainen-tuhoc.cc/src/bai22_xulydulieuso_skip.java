import java.text.DecimalFormat;

public class bai22_xulydulieuso_skip {
    public static void main(String[] args) {
        /*//1. làm tròn số
        DecimalFormat dcf = new DecimalFormat("#.##");//làm tròn 2 chữ số
        double dtb = (7.0+5.2+6.5)/3;
        //xuất bình thường
        System.out.println(dtb);
        //xuất định dạng
        System.out.println(dcf.format(dtb));

        //2. dùng ngăn cách phần ngàn
        double luong = 17000000;
        //khai báo đối tượng DecimalFormatSymbols
        DecimalFormatSymbols dcfs = new DecimalFormatSymbols();
        //set ngăn cách bằng dấu .
        dcfs.setDecimalSeparator('.'); // nháy đơn
        dcf.setDecimalFormatSymbols(dcfs);
        System.out.println(dcf.format(luong));*/

        double luong = 1700.05899;
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        String s = df.format(luong);
        System.out.println(s); // in ra "$1,700.06"

    }
}
