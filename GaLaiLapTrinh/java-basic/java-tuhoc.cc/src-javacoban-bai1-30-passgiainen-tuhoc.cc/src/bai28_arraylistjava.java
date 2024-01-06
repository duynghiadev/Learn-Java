import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_arraylistjava {
    public static void main(String[] args) {
        //1. khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        //khai báo số lượng phần tử ban đầu (ví dụ 5pt)
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //khởi tạo với các phần tử sẵn có
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,3,5,9));
        System.out.println(lst); // []
        System.out.println(lst2); // []
        System.out.println(lst3); //[1, 3, 5, 9]

        //2. add thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add vào cuối (truyền 1 đối số)
        lst4.add(1);
        lst4.add(9);
        lst4.add(10);
        System.out.println("ls4= "+lst4); // ls4= [1, 9, 10]
        //add(index,element) vào vị trí chỉ định
        lst4.add(2,99);
        System.out.println("ls4= "+lst4); // ls4= [1, 9, 10]

        //2.2 size: Trả về số pt của list
        System.out.println("Số pt của lst4= "+lst4.size()); // 4

        //2.3 get(int index) : trả về giá trị list tại vị trí index
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,3,5,9));
        System.out.println(lst5.get(2)); //5

        //2.4 remove (index)
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,3,5,9));
        System.out.println("ls6 trước: " +lst6); // [1, 3, 5, 9]
        lst6.remove(1);
        System.out.println("ls6 sau xoá: " +lst6); // [1, 5, 9]

        //2.5 remove (1 phần tử đc chỉ định)
        ArrayList<Integer> lst66 = new ArrayList<>(List.of(1,3,9,5,9));
        System.out.println("ls66 trước: " +lst66); // [1, 3, 9, 5, 9]
        lst66.remove(Integer.valueOf(9));
        System.out.println("ls66 sau xoá: " +lst66); // [1, 3, 5, 9]

        //2.6 set(index,element) : thay đổi thông tin
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,3,5,9));
        System.out.println("ls7 trước: " +lst7); // [1, 3, 5, 9]
        lst7.set(1,100); //thay vị trí index 1 thành số 100
        System.out.println("lst7 sau: "+lst7); // [1, 100, 5, 9]

        //2.7 contains() Kiểm tra Collection có chứa phần tử nào đó hay không
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(1,3,5,9));
        boolean ktra= lst8.contains(3);
        System.out.println(ktra); //true

        //2.8 Collections.sort(list) : SX tăng dần
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(13,3,55,9));
        Collections.sort(lst9); // lưu ý Collections có chữ s
        System.out.println("lst9 sau sxep tăng: " +lst9);
        // 2.9 Collections.reverse(list ) đảo ngược list
        Collections.reverse(lst9);
        System.out.println("lst9 sau đảo là: "+lst9);

        //2.10 list.isEmpty() : Kiểm tra list có phải là list rỗng
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(13,3,55,9));
        //xoá toàn bộ list
        lst10.clear();
        //ktra lst10 rỗng hay không?
        System.out.println(lst10.isEmpty()); // true


        //2.12 indexOf() : Tìm vị trí đầu tiên của element trong list
        //nếu 0 tồn tại trả về -1
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(13,3,55,9,9,9,9));
        System.out.println(lst11.indexOf(9));
        //trả về vị trí 3 (vị trí đầu tiên tìm thấy )

        System.out.println(lst11.lastIndexOf(9));
        //trả về vị trí 6 (vị trí cuối cùng tìm thấy )

        //3. Duyệt list
        //3.1 cách 1
        ArrayList<Integer> lst12 = new ArrayList<>(List.of(1,2,3,4));
        System.out.println("lst 12 duyệt for: ");
        for (int value : lst12) {
            System.out.println(value);
        }

        //3.2 cách 2 khi cần sử dụng đến các chỉ số index
        ArrayList<Integer> lst13 = new ArrayList<>(List.of(13,3,55,9,9,9,9));
        for (int i = 0; i < lst13.size(); i++) {
            int value = lst13.get(i);
            System.out.println(value);
        }















    }
}
