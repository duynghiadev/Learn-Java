import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_4giaibt30 {
    /*
    Viết chương trình trả lời kết quả các phép tính
     quest = {"2 + 5 + 7 =","5 * 10 =","sqrt(16) =","12%2 =“}
     */
    public static void main(String[] args) {
        //cho phép người dùng nhập liệu
        Scanner sc = new Scanner(System.in);
        // List đề cho
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2 + 5 + 7 =",
                "5 * 10 =",
                "sqrt(16) =",
                "12%2 ="
        ));
        // List đáp án
        ArrayList<Float> traLoi = new ArrayList<>(List.of(14f,50f,4f,0f));
        //duyệt list câu hỏi:
        for (int i=0; i<quest.size();i++){
            System.out.println(quest.get(i));
            //nhập kết quả
            System.out.println("nhập kết quả: ");
            Float kq = sc.nextFloat();
            //ktra với đáp án
            if (kq.equals(traLoi.get(i)))
                System.out.println("Đúng cmn nó luôn! ");
            else
                System.out.println("Sai lòi mắt cụ ơi, đáp án là: " +traLoi.get(i));
        }
    }
}
