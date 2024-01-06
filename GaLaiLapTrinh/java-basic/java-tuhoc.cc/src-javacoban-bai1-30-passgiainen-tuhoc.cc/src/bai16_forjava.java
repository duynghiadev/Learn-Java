public class bai16_forjava {
    public static void main(String[] args) {
        //xuất các số chẵn từ 0-10
        for (int i=0;i<=10;i+=2){
            System.out.println("i= "+i);
        }

        //tính tổng các số chẵn từ 0-10
        int tong = 0;
        for (int i=0;i<=10;i+=2){
            tong+=i; //tong = tong +i;
            System.out.println("tong= "+tong);
        }

    }
}
