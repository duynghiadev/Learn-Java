import java.util.HashMap;

public class bai29_giaibt34 {
    public static void main(String[] args) {
        // Tạo một HashMap để lưu trữ các giá trị
        HashMap<String, Integer> dict = new HashMap<String, Integer>();

        // Thêm các giá trị vào HashMap
        dict.put("A", 1);
        dict.put("B", 2);
        dict.put("C", 3);
        dict.put("D", 2);
        dict.put("E", 1);
        dict.put("F", 4);
        dict.put("G", 2);
        dict.put("H", 4);
        dict.put("I", 1);
        dict.put("J", 8);
        dict.put("K", 5);
        dict.put("L", 1);
        dict.put("M", 3);
        dict.put("N", 1);
        dict.put("O", 1);
        dict.put("P", 3);
        dict.put("Q", 10);
        dict.put("R", 1);
        dict.put("S", 1);
        dict.put("T", 1);
        dict.put("U", 1);
        dict.put("V", 4);
        dict.put("W", 4);
        dict.put("X", 8);
        dict.put("Y", 4);
        dict.put("Z", 10);

        // Tách số và chữ và hiển thị chúng lên màn hình
        String input = "University of Technology and Education";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                System.out.print(c);
            } else if (Character.isLetter(c)) {
                System.out.print(dict.get(Character.toString(c)));
            }
        }
    }
}
