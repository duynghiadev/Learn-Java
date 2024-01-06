public class bai20_xulybietle {
    public static void main(String[] args) {
        int a = 10;
        int b= 0;
        /*int c=a/b;
        System.out.println("c= "+c);
        System.out.println("Đoạn code phía sau");*/

        try {
            int c=a/b;
            System.out.println("c= "+c);
        }
        catch (ArithmeticException ex){
            System.out.println("Có lỗi toán học thím ơi, coi lại nha..");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Có lỗi thím ôi..");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Đoạn code thực thi, kể cả khi ctrinh lỗi");
        }
        System.out.println("Đoạn code phía sau");
    }
}
