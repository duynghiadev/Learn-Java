import java.text.DecimalFormat;

public class bai23_mathinjava {
    public static void main(String[] args) {
        System.out.println("Pi = "+ Math.PI);
        //trị tuyệt đối
        int a=-5;
        System.out.println(Math.abs(a)); // trả về 5
        //max, min
        System.out.println(Math.max(7,8)); // trả về 8
        System.out.println(Math.min(7,8)); // trả về 7
        //căn bậc 2
        System.out.println(Math.sqrt(4)); // trả về 4
        //luỹ thừa
        System.out.println(Math.pow(2,3)); // trả về 8
        //sin, cos, tan
        int goc = 90;
        double sin90 = Math.sin(Math.PI*goc/180) ;
        double cos90 = Math.cos(Math.PI*goc/180) ;
        double tan90 = Math.tan(Math.PI*goc/180) ;
        System.out.println("sin90= " +sin90);
        System.out.println("cos90= " +cos90);
        System.out.println("tan90= " +tan90);
    }
}
