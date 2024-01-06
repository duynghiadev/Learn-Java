public class bai17_6giaibtjava16 {
    /*
    Bài tập Java 16:
       Viết chương trình :
       Tính tổng S= 1!+2!+3!+....+10!
     */
    public static void main(String[] args) {
        int m = 1;
        int tong = 0;
        for (int i = 1; i <=10; i++)
        {
            m = i * m;
            System.out.println(m);
            //tong += m; //tong = tong +m;
        }
        System.out.println("Tổng S = 1! + 2! + 3! + ....+10! = " +tong);
    }
}
