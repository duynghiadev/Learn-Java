import java.util.StringTokenizer;

public class bai26_stringjava {
    public static void main(String[] args) {
        String s = "Hồi đó tôi chê mồm em rộng" +
                "\nKhông tin hai đứa chập mồm đo";
        System.out.println(s);
        //5. khởi tạo đối tượng
        StringBuilder chuoi = new StringBuilder();
        //7. các phương thức thường dùng
        //7.1 append :Thêm vào cuối chuỗi
        chuoi.append("xin chào, ");
        chuoi.append("Tôi là học sinh mới");
        System.out.println(chuoi);
        //7.2. insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2,"obama");
        System.out.println("chuỗi sau khi chèn: ");
        System.out.println(chuoi);

        //7.3. delete(start, end):
        //xóa tất cả các ký tự từ vị trí start đến vị trí end - 1
        chuoi.delete(2,7);
        System.out.println("chuỗi sau khi xoá: ");
        System.out.println(chuoi);

        //7.4. chuoi.length : trả về độ dài của chuỗi tính cả space
        System.out.println("Độ dài= " + chuoi.length());

        //7.5 IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        //trả về -1 nếu không tìm thấy
        String s7 = "tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi")); // trả  về 0

        //7.6 LastIndexOf: Trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi
        //Trả về -1 nếu không tìm thấy
        String s8 = "tôi đi tìm tôi";
        System.out.println(s8.lastIndexOf("tôi")); // trả  về 11


        //7.7 Contains : Kiểm tra chuỗi con
        String s9=".mp3";
        String s10="tuhoc.mp3";
        //kiểm tra s10 có chứa cụm string của s9 không?
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("Có .mp3 trong chuỗi");
        else
            System.out.println("Không tìm thấy .mp3 trong chuỗi");



        //7.8 Substring : Trích lọc chuỗi con từ chuỗi ban đầu
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)
        String s11 = "abcdefgh";
        String s12=s11.substring(4,6); // lấy từ index 4 đến sát 6
        String s13=s11.substring(4); // lấy từ index 4 đến hết
        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);

        //7.9 replace(“str old", “str new“)
        String s14 = "học học nữa học mãi";
        String s15 = s14.replace("học","ngủ");
        System.out.println(s14);
        System.out.println(s15);

        //7.10 replaceFirst(“str old", “str new“)
        String s16 = "học học nữa học mãi";
        String s17 = s16.replaceFirst("học","ngủ");
        System.out.println(s16);
        System.out.println(s17);

        //7.11 trim(): Xóa toàn bộ khoảng trắng ở đầu và cuối
        String s18="     Gà lại lập trình       ";
        String s19=s18.trim();
        System.out.println(s18);
        System.out.println(s19);

        //7.12 trim(): Xóa toàn bộ khoảng trắng ở cuối
        //cách 1:  biểu thức chính quy (regular expression)
        // dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s20 = s18.replaceAll("\\s+$", "");
        System.out.println(s20);

        //cách 2:Xoá khoảng trắng cuối chuỗi bằng vòng lặp
        String s21="     Gà lại lập trình       ";
        while (s21.endsWith(" ")) {
            s21 = s21.substring(0, s21.length() - 1);
        }
        System.out.println(s21);  // In ra "     Gà lại lập trình"

        //7.13 trim(): Xóa toàn bộ khoảng trắng ở đầu
        //cách 1:Xoá khoảng trắng cuối chuỗi bằng vòng lặp
        String s22="     Gà lại lập trình       ";
        while (s22.startsWith(" ")) {
            s22 = s22.substring(1); //lấy từ 1 đến hết
        }
        System.out.println(s22);  // In ra "Gà lại lập trình     "

        //cách 2:  biểu thức chính quy (regular expression)
        // dùng ^\\s+ để xóa tất cả các khoảng trắng ở đầu chuỗi
        String s23="     Gà lại lập trình       ";
        String s24 = s23.replaceFirst("^\\s+", "");
        System.out.println(s24); // In ra "Gà lại lập trình     "

        //7.14 compareTo: So sánh 2 chuỗi
        String s25 ="abc13579";
        String s26 ="abc13579";
        int x=s25.compareTo(s26);
        //trả về x= 0
        System.out.println("x= "+ x);

        //so sánh 2:
        String s27 ="Abc13579";
        String s28 ="abc13579";
        //A có giá trị 65 trong bảng ASII
        //a có giá trị 97 trong bảng ASII
        //65-97 = -32
        int x2=s27.compareTo(s28);
        //trả về x2 =-32 < 0
        System.out.println("x2= "+ x2);

        //so sánh 0 pbiet hoa thường: :
        String s29 ="Abc13579";
        String s30 ="abc13579";
        int x3=s29.compareToIgnoreCase(s30);
        //trả về x3=0
        System.out.println("x3= "+ x3);

        //7.15 Cộng chuỗi
        //cách 1: cộng kiểu thổ dân
        String s31 = "Hôm nay";
        s31 = s31+" trời mưa";
        System.out.println(s31);
        //cộng chuỗi dùng stringbuilder
        //khởi tạo
        StringBuilder s32 = new StringBuilder();
        StringBuilder s33 = new StringBuilder("Hôm nay");
        //insert chèn vào chuỗi
        StringBuilder s34 = new StringBuilder("0123456");
        s34.insert(2,"tuhoc.cc");
        System.out.println(s34);
        //thêm vào cuối dùng append
        StringBuilder s35 = new StringBuilder("1234");
        s35.append("tuhoc.cc");
        System.out.println(s35);
        //xoá từ start đến end
        StringBuilder s36 = new StringBuilder("0123456789");
        s36.delete(1,3); //xoá từ 1 đến sát 3
        System.out.println(s36);
        //đảo ngược chuỗi
        StringBuilder s37 = new StringBuilder("123456789");
        s37.reverse();
        System.out.println(s37);

        //7.17 spit tách chuỗi:
        String s38 = "Hello, World!";
        String[] mang = s38.split(",");
        //duyệt mảng
        for (int i = 0; i < mang.length; i++){
            System.out.println(mang[i]);
        }

        //7.18 toLowerCase() && toUpperCase()
        String s39 = "Em học Lập tRÌNH tại TUhoc.cc";
        String s40 =s39.toLowerCase();
        System.out.println(s40);
        String s41 =s39.toUpperCase();
        System.out.println(s41);

        //7.19 toCharArray()  tách chuỗi thành từng ký tự, cho vào mảng
        String s42 = "abcdef123@";
        char[] mang2 = s42.toCharArray();
        //duyệt mảng
        for (int i = 0; i < mang2.length; i++){
            System.out.println(mang2[i]);
        }


        //7.20 reverse() Đảo ngược chuỗi
        String s43 = "123456abc";
        //khai báo đối tượng sb thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(s43);
        //dùng phương thức reverse để đảo ngược
        sb.reverse();
        String s44 = sb.toString(); //chuyển sang chuỗi
        System.out.println(s44);  // In ra "cba654321"



        //8. Tách chuỗi dùng StringTokenizer
        String chuoi2 = "Chào các bạn nhé, tôi đi học đây";
        StringTokenizer st =new StringTokenizer(chuoi2,",");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());

        //tách theo tổ hợp nhiều ký tự
        String chuoi3 = "thị nở, chí phều; nam thấp";
        StringTokenizer st2 =new StringTokenizer(chuoi3,",;");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());


    }
}
