public class bai26_9giaibt26_toiuuhoachuoi {
    public static void main(String[] args) {
        /*
         Java 26 :
          Nhập vào 1 chuỗi =>  Tối ưu hoá chuỗi ( chuẩn hoá chuỗi) theo quy tắc : 	1, không có khoảng trắng dư thừa
            2, các từ cách nhau bởi 1 khoảng trắng
            3, Ký tự đầu tiên của mỗi từ phải được viết hoa
            Ví dụ : input: “    Gà lạI LẬp     TRìnH     ”
            Output: “Gà Lại Lập Trình”
         */
        String input = "    Gà lạI LẬp     TRìnH     ";
        System.out.println(chuanHoa(input));
    }
    public static String chuanHoa(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0, 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}
