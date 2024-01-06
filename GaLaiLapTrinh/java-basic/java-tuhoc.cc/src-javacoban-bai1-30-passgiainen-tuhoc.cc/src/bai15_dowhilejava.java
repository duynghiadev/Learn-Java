public class bai15_dowhilejava {
    public static void main(String[] args) {
        //tính tổng các số từ 1-5
        /*int a=1; // test với a=6 để thấy khác với vòng while
        int tong =0;
        do {
            tong+=a;//tong = tong+a
            a++;
        }while (a<=5);
        System.out.println("Tổng từ 1 đến 5 là: "+tong);*/

        //while true
        //tăng n lên 1 đến khi nào =5 thì thoát
        int n = 0;
        do {
            n++;
            System.out.println("n= " + n);
        } while (n != 5);
    }
}
