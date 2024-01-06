import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai27_2giaibtjava27 {
    public static void main(String[] args) {
        /*
         1. Viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên,
         có n phần tử ngẫu nhiên, n do người dùng nhập từ bàn phím
        2. Xuất các giá trị trong mảng
        3. Đảo ngược mảng, và xuất mảng sau khi đảo ngược
        4. Sắp xếp mảng tăng dần
        5. Tính tổng các phần tử trong mảng
        6. Cho người dùng nhập 1 số bất kỳ,
        kiểm tra số đó có tồn tại trong mảng hay không,
        nếu có xuất ra vị trí index của số đó trong mảng
         */
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // Tạo mảng gồm n phần tử
        int[] M = new int[n];
        // Tạo các phần tử ngẫu nhiên cho mảng
        for (int i = 0; i < n; i++) {
            int soNgauNhien= rd.nextInt(4); //từ 0-99
            M[i] = soNgauNhien; // Số ngẫu nhiên trong khoảng [0, 100)
        }

        // 2. Xuất các giá trị trong mảng
        System.out.println("Mảng có các phần tử: ");
        System.out.println(Arrays.toString(M));

        //3.Đảo ngược mảng, và xuất mảng sau khi đảo ngược
        for (int i = 0, j = M.length - 1; i < j; i++, j--) {
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        // xuất mảng  đã được đảo ngược
        System.out.println("Mảng sau đảo ngược là: ");
        System.out.println(Arrays.toString(M));

        //4. Sắp xếp mảng tăng dần
        Arrays.sort(M);
        System.out.println("Mảng sau sx là: ");
        System.out.println(Arrays.toString(M));

        //5. Tính tổng các phần tử trong mảng
        int tong = 0;
        for (int pt:M){
            tong+= pt;
        }
        System.out.println("Tổng các số trong mảng là: "+tong);

        //6.
        System.out.println("Mời nhập vào 1 số:  ");
        int so = sc.nextInt();
        boolean ktra = false;
        String vitri = "";
        for (int i=0; i<M.length ;i++){
            if (M[i] ==so)
            {
                ktra = true;
                vitri+= (i+" ");
            }
        }
        if (ktra)
            System.out.println(so+" tồn tại trong mảng với vị trí index: " +vitri);
        else
            System.out.println(so+" tồn tại trong mảng");
    }
}
