import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_5giaibt31 {
    /*
    Viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
    các phần tử là số nguyên , n nhập từ bàn phím
	#1 in ra có bao nhiêu số nhỏ hơn 80,
	#2 và in ra vị trí index các số đó
     */
    public static void main(String[] args) {
        //khởi tạo list
        ArrayList<Integer> list = new ArrayList<>();
        //cho phép nhập liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua list: ");
        int n = sc.nextInt();
        //khởi tạo đối tượng ngẫu nhiên
        Random rd = new Random();
        //duyệt và add phần tử ngẫu nhiên vào list
        for (int i = 0; i < n; i++) {
            int soNgauNhien = rd.nextInt(101);
            list.add(soNgauNhien);
        }
        //xuất danh sách
        System.out.println("Danh sách vừa được tạo ra là: ");
        System.out.println(list);

        int count = 0;
        String viTri="";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 80) {
                count++;
                //  thêm vị trí vào chuỗi vitri
                viTri+= i+" ";
            }
        }
        if (count==0)
            System.out.println("Không có số <80 trong list");
        else
        {
            System.out.println("So luong so nho hon 80: " + count);
            System.out.println("vị trí các số <80 : " +viTri);
        }
    }
}
