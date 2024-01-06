import java.util.Scanner;

public class bai13_switchjava {
    public static void main(String[] args) {
        /*//nhập vào 1 số kiểm tra chẵn hay lẻ dùng swich case
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 số: ");
        int a = sc.nextInt();
        //kiểm tra số dư của a/2
        int div = a%2;
        switch (div)
        {
            case 0:
                System.out.println(a+ " là số chẵn");
                break;
            default:
                System.out.println(a+ " là số lẻ");
                break;
        }*/

        //swich biến thể
        //nhập vào tháng kiểm tra có bao nhiêu ngày
        //_ Tháng 1,3,5,7,8,10,12 có 31 ngày
        //_ Tháng  4,6,9,11 có 30 ngày
        //_ Tháng  2 có 28 hoặc 29 ngày
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 tháng: ");
        int t = sc.nextInt();
        switch (t){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Không có tháng đó =))");
                break;
        }
    }
}
