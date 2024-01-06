import java.util.HashMap;

public class bai29_hasmap {
    public static void main(String[] args) {
        //1. khai báo
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        //2. Thêm các phần tử vào hasmap
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");

        //3.Lấy giá trị của một phần tử
        String Value = map.get(1);
        System.out.println(Value); // apple

        //4.Xóa phần tử khỏi hasmap
        map.remove(2);

        //5. Kiểm tra xem một phần tử có tồn tại trong map hay không
        boolean isPresent = map.containsKey(1);
        System.out.println(isPresent); // true

        //6.Kiểm tra xem một giá trị có tồn tại trong map hay không
        boolean isValuePresent = map.containsValue("apple");
        System.out.println(isValuePresent); // true

        //7.Kiểm tra xem hasmap có rỗng hay không
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty); // false

        //8. Lấy số lượng phần tử trong hasmap
        int size = map.size();
        System.out.println(size); // 2

        //9.Duyệt hasmap
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }

    }
}
