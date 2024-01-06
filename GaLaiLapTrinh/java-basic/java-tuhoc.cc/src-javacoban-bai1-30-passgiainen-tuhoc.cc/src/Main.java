public class Main {
    public static void main(String[] args) {
        // khai báo biến S và gán giá trị ban đầu là 0
        long S = 0;
        // dùng vòng lặp for để duyệt qua các giá trị từ 1 đến 10
        for (int i = 1; i <= 10; i++) {
            // tính giá trị i! và cộng vào biến S
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            S += factorial;
        }
        // in kết quả ra màn hình
        System.out.println("S = " + S);
    }
}
