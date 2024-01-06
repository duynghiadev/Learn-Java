public class bai26_2giaibtjava19 {
    public static void main(String[] args) {
        /*
        Java19 Cho:
        String str1= “English = 78 Science = 83 Math = 68 History = 65”
         1. tính tổng các số trong chuỗi trên
         2. tính trung bình cộng
         */
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";

        // Tách chuỗi thành các phần bằng cách sử dụng phương thức split() của lớp String
        String[] parts = str1.split(" ");

        int sum = 0; // Biến lưu tổng
        int count = 0; // Biến lưu số lượng số đã xử lý
        // Duyệt qua từng phần và chuyển nó sang kiểu số nếu có thể
        for (String part : parts) {
            try {
                // Chuyển chuỗi sang số nguyên bằng phương thức parseInt() của lớp Integer
                int num = Integer.parseInt(part);
                sum += num; // Cộng thêm số vào tổng
                count++; // Tăng số lượng số đã xử lý
            } catch (NumberFormatException e) {
                // Nếu không thể chuyển sang số, bỏ qua phần này
            }
        }
        // Tính trung bình cộng
        double avg = (double) sum / count;
        System.out.println("Tổng các số trong chuỗi là: " + sum);
        System.out.println("Trung bình cộng các số trong chuỗi là: " + avg);
    }
}
