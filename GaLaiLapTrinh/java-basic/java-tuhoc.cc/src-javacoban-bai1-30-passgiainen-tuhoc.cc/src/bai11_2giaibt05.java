import java.util.Scanner;

public class bai11_2giaibt05 {
    /*
    Bài tập java 05: Viết chương trình nhập vào chiều cao,
    cân nặng, tính BMI và xuất ra thông báo
            BMI<15: Thân hình quá gầy
            BMI>=15 and BMI<16: Thân hình gầy
            BMI>=16 and BMI<18.5: Thân hình hơi gầy
            BMI>=18.5 and BMI<25:Thân hình bình thường
            BMI>=25 and BMI < 30:Thân hình hơi béo
            BMI >=30 and BMI<35:Thân hình béo
            BMI >=35:Thân hình quá béo
            Gợi ý cách tính : BMI=canNang/(chieuCao ^2 )
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chiều cao(m):");
        double chieuCao = sc.nextDouble();
        System.out.println("Mời nhập vào cân nặng(kg)");
        double canNang = sc.nextDouble();
        //tính bmi
        double bmi = canNang/(Math.pow(chieuCao,2));
        //kiểm tra điều kiện
        if (bmi<15)
            System.out.println("Thân hình quá gầy");
        else if (bmi>=15 && bmi<16)
            System.out.println("Thân hình gầy");
        else if (bmi>=16 && bmi<18.5)
            System.out.println("Thân hình hơi gầy");
        else if (bmi>=18.5 && bmi<25)
            System.out.println("Thân hình bình thường");
        else if (bmi>=25 && bmi<30)
            System.out.println("Thân hình hơi béo");
        else
            System.out.println("Thân hình quá béo");
    }
}
