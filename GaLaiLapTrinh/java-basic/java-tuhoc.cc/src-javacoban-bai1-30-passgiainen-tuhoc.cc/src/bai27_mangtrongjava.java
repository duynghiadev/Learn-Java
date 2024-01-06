import java.util.Arrays;

public class bai27_mangtrongjava {
    public static void main(String[] args) {
        //1. khai báo mảng:
        String[] mangStr;
        int[] mangNguyen;
        boolean[] mangBool;

        //2. khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[15]; //chứa đc tối đa 15 phần tử
        int[] mangNguyen2 = new int[7]; //chứa đc tối đa 7 phần tử

        //3. khởi tạo mảng kèm giá trị ban đầu
        String[] mangStr3 = new String[]{"chí phèo","thị nở","ông giáo"};
        String[] mangStr4 = {"chí phèo","thị nở","ông giáo"};

        //4.truy xuất phần tử của mảng qua vị trí index
        int[] mang5 = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(mang5[0]); // 10
        System.out.println(mang5[1]); // 20
        System.out.println(mang5[2]); // 30
        System.out.println(mang5[9]); // 100

        //5. length : trả về số phần tử của mảng
        // ( chiều dài mảng, bắt đầu từ 1 )
        System.out.println("Chiều dài mảng 5: "+mang5.length);

        //6. Duyệt mảng dùng for
        //cách 1 : Dùng để xuất các phần tử
        for (int pt : mang5) {
            System.out.println(pt);
        }

        //cách 2 : dùng for duyệt qua index
        //lưu ý : index mảng từ 0 -> length -1
        for (int i=0 ;i<mang5.length ;i++){
            //in ra vị trí index
            System.out.println(i);
            //in ra giá trị của mảng tại vị trí index i
            System.out.println(mang5[i]);
        }

        //7. Thay đổi giá trị cho mảng
        // Cách 1:  gọi trực tiếp theo index để gán giá trị mới
        System.out.println(mang5[0]); // 10
        mang5[0] =99; // thay giá trị index 0 bằng 99
        System.out.println(mang5[0]); // 99

        // Cách 2 dùng for để update toàn bộ
        int[] mang6 = {1,2,3,4,5};
        for (int i=0; i<mang6.length; i++){
            mang6[i] +=2;
        }
        //duyệt mảng 6 để xem kết quả sau khi thay đổi
        System.out.println("mảng 6 sau khi đổi");
        for (int pt:mang6){
            System.out.print(pt+" ");
        }

        System.out.println();

        //9. sắp xếp mảng
        int[] mang7 = {21,10,3,9,5};
        //sắp xếp mảng nguyên
        Arrays.sort(mang7);
        //xuất mảng sau sx
        System.out.println("Mảng sau sx tăng là: ");
        System.out.println(Arrays.toString(mang7));

        //10. đảo ngược mảng
        int[] mang8 = {1, 10, 3, 9, 5};
        for (int i = 0, j = mang8.length - 1; i < j; i++, j--) {
            int temp = mang8[i];
            mang8[i] = mang8[j];
            mang8[j] = temp;
        }
        // xuất mảng  đã được đảo ngược
        System.out.println("Mảng sau đảo ngược là: ");
        System.out.println(Arrays.toString(mang8));

        //11. gán mảng
        int[] mang9 = {1, 10, 3, 9, 5};
        int[] mang10 = mang9;
        //thử thay đổi mảng 9 tại vị trí 0
        mang9[0] =101;
        System.out.println(Arrays.toString(mang9));
        System.out.println(Arrays.toString(mang10));

        //12. clone mảng, sang vùng nhớ mới
        int[] mang11 = {1, 10, 3, 9, 5};
        int[] mang12 = mang11.clone();
        mang11[0] =101;
        System.out.println(Arrays.toString(mang11));
        System.out.println(Arrays.toString(mang12));






    }
}
