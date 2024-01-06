public class bai26_5giaibt22 {
    public static void main(String[] args) {
        /* bài tập java 20
            Cho chuỗi : a = "tôi chăm học tôi chịu khó tôi đẹp zai";
            Đếm từ tôi trong chuỗi trên
         */
        String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
        // Tách chuỗi a thành các từ riêng biệt
        String[] words = a.split(" ");

        // Khởi tạo biến đếm số lần xuất hiện của từ "tôi"
        int count = 0;
        // Duyệt qua từng từ trong danh sách các từ đã tách ra
        for (String word : words) {
            if (word.equals("tôi")) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("Số lần xuất hiện của từ 'tôi' là: " + count);

    }
}
