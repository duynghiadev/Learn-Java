public class bai9_toantulogic {
    public static void main(String[] args) {
        int i = 7;
        //kiểm tra i>0 và i<10 không?
        System.out.println(i>0 && i<10); //true
        //kiểm tra i>9 hoặc i<10
        System.out.println(i>9 || i<10); //true
        //phủ định
        System.out.println(!(i>9 || i<10)); //false

        //toán tử tiền tố hậu tố
        int x=100;
        int y=90;
        int z=80;
        int t=70;
        x++; //tăng x lên 1
        ++y; //tăng y lên 1
        z--; //giảm z đi 1
        --t; //giảm t đi 1

        //biểu thức phứca tạp
        int a=1;
        int b=2;
        int c= a++ - ++b +1;
        System.out.println(a); // a=2
        System.out.println(b); //b= 3
        System.out.println(c); // c=-1

    }
}
