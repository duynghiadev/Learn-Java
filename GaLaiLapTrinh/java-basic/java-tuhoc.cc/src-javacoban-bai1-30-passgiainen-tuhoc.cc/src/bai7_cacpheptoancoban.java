public class bai7_cacpheptoancoban {
    public static void main(String[] args) {
        //khai báo biến
        int a=11;
        int b=5;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        //phép cộng
        System.out.println("a+b=" + (a+b));
        //gán biến lấy kết quả
        int kq = a+b;
        System.out.println("a+b=" + kq);
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a%b=" + (a%b));
        Integer c=222;
        //lưu ý phép chia (dễ mất dữ liệu)
        System.out.println("a/b=" + ((double)a/b));
    }
}
