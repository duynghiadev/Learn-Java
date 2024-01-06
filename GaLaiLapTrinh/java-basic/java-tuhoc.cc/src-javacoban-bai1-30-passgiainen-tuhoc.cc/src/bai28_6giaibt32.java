import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bai28_6giaibt32 {
    /*
    Cho list lst={1,9,3,14,5,27,8}
	Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
	     # 2: in ra vị trí index số đó
	đáp án: :
	# số lớn thứ 2: 4 , vị trí index trong list là 3
	# số nhỏ thứ 2 trong list là 2, vị trí index trong list là 1
     */
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        //tạo ra 1 list mới giá trị giống với lst
        List<Integer> copy = new ArrayList<>(lst);
         // Sắp xếp list theo thứ tự tăng dần
        Collections.sort(copy);
        //in thử list copy sau sx
        System.out.println(copy);
        // In ra số lớn thứ 2 và số nhỏ thứ 2 trong list
        int soLonThu2= copy.get(copy.size()-2);
        int soNhoThu2 = copy.get(1);
        System.out.println("Số lớn thứ 2: " +soLonThu2 );
        System.out.println("Số nhỏ thứ 2: " + soNhoThu2);
        // In ra vị trí index của số lớn thứ 2 và số nhỏ thứ 2 trong list
        System.out.println("Vị trí index của số lớn thứ 2: " + lst.indexOf(soLonThu2));
        System.out.println("Vị trí index của số nhỏ thứ 2: " + lst.indexOf(soNhoThu2));
    }
}
