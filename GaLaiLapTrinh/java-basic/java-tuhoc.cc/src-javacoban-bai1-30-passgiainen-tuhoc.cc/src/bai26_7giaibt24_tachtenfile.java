public class bai26_7giaibt24_tachtenfile {
    public static void main(String[] args) {
        /*
        Java 24 :
        Viết chương trình trích lọc string từ đường dẫn D:/galailaptrinh/music/remix.mp3
        1, tách tên tệp bao gồm cả đuôi : remix.mp3
        2, tách tên file : remix
         */
        String path = "D:/galailaptrinh/music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        //in thử vị trí index
        System.out.println(lastSlashIndex);
        String fileName = path.substring(lastSlashIndex + 1);
        System.out.println(fileName); // In ra: "remix.mp3"
        /*
        sử dụng phương thức lastIndexOf để tìm vị trí cuối cùng của ký tự '/' trong chuỗi.
        Sau đó, sử dụng phương thức substring để trích lọc chuỗi từ vị trí cuối cùng của ký tự '/'
        cho đến cuối chuỗi
         */
        //2. chỉ in remix
        int lastDotIndex = fileName.lastIndexOf('.');
        //trích từ chuỗi filename, lấy từ đầu(index 0 -> sát vị trí index lastDotIndex)
        String nameOnly = fileName.substring(0, lastDotIndex);
        System.out.println(nameOnly); // In ra: "remix"
    }
}
