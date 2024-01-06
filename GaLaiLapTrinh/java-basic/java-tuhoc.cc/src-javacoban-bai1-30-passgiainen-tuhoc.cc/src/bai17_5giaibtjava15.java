public class bai17_5giaibtjava15 {
    /*
    Bài tập Java 15:
    Viết chương trình :
    Tìm những số chia hết cho 3 từ 10 đến 50
     */
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i++)
        {
            if (i%3==0)
                System.out.println(i+" ");
        }
    }
}
