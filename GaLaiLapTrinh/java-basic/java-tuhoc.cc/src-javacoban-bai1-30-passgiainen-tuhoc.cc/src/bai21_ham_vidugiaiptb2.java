import java.util.Scanner;

public class bai21_ham_vidugiaiptb2 {
    /*
      Viết chương trình giải ptb2 dùng hàm :
      	1 . Tìm nghiệm của ptb2 với : a = 1, b= 2, c = 3
        2. Tìm nghiệm của ptb2 với : a = 1, b= 2, c = 1
        3. Tìm nghiệm của ptb2 với : a = 1, b= 2, c = -3
     */
    public static void main(String[] args) {
        String kq = giaiPTB2(0,2,3);
        String kq1 = giaiPTB2(1,2,3);
        String kq2 = giaiPTB2(1,2,1);
        String kq3 = giaiPTB2(1,2,-3);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println(kq3);
        //nâng cao: Cho người nhập a,b,c từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào a: ");
        double a= sc.nextDouble();
        System.out.println("Mời nhập vào b: ");
        double b= sc.nextDouble();
        System.out.println("Mời nhập vào c: ");
        double c= sc.nextDouble();
        String kq4 = giaiPTB2(a,b,c);
        System.out.println(kq4);

    }
    public static String giaiPTB2(double a,double b,double c){
        //nếu a = 0, pt trở thành bậc nhất bx +c=0
        if (a==0){
            if (b==0 && c==0)
                return "Pt bậc nhất vô số nghiệm";
            else if (b==0 && c!=0)
                return "Pt bậc nhất vô nghiệm";
            else
                return "Pt có nghiệm x= "+-c/b;
        }
        else {
            //giải pt bậc 2
            double delta = (b*b)-(4*a*c);
            if (delta<0)
                return "pt bậc 2 vô nghiệm";
            else if (delta==0){
                double x= -b/(2*a);
                return "pt bậc 2 có nghiệm kép x= "+x;
            }
            else {
                double x1= (-b+Math.sqrt(delta))/(2*a);
                double x2= (-b-Math.sqrt(delta))/(2*a);
                return "pt bậc 2 có 2 nghiệm phân biệt x1 = "+x1 +" ;x2= "+x2;
            }
        }
    }
}
