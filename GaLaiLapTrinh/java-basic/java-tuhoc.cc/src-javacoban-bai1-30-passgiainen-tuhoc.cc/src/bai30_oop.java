import TinhDaHinh.NhanSu;
import TinhDaHinh.PhoPhong;
import TinhDaHinh.TruongPhong;
import TruongDaiHoc.SinhVien;
public class bai30_oop {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        //khởi tạo sinh viên 2 qua constructor có đối số
        SinhVien sv2 = new SinhVien("nguyễn văn a",9.5);
        sv2.hienThiThongTin();

        //khởi tạo sinh viên 3 cùng package:
        SinhVienCungPk sv3 = new SinhVienCungPk("ối dồi ôi", 9.9);
        sv3.hoTen="hacker";
        sv3.diem=0.0;

        //8. Test get/ set
        //xuất điểm của sv2
        System.out.println(sv2.getDiem());
        //xem tên của sv 2
        System.out.println(sv2.getHoTen());
        //Sửa tên,điểm của sv2
        sv2.setDiem(3.2);
        sv2.setHoTen("ngoc trinh");
        //xuất kết quả sau sửa :
        sv2.hienThiThongTin();

        //9. test phương thức có kiểu trả về
        double dtbSv2 = sv2.tinhDTB(5.5,6.2);
        System.out.println(dtbSv2);

        //test phương thức không có kiểu trả về
        sv2.hienThiThongTin();

        //test toString
        System.out.println(sv2);

        //11. Support Method và Service Method
        //sv2.checkDiem(); không gọi được
        sv2.checkHopLeDiem();

        //13. Parametter List Method
        double tongDiem = sv2.TongDiem(5,6,7,5.2,9.2);
        System.out.println(tongDiem);


        //15. test kế thừa
        //khởi tạo nhân viên từ class nhân viên
        //NhanVien nv1 = new NhanVien("nhân viên 1", 555,"BN");
        //khởi tạo nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1",123456,"HN");
        //test tính lương
        //System.out.println("Lương nhân viên 1: " +nv1.tinhLuong());
        System.out.println("Lương hành chính 1: " +hc1.tinhLuong());

        //15.4 khởi tạo nhân viên đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("nhân viên ca1",5542,"BG",1);
        System.out.println("lương nhân viên ca1 là: " +ca1.tinhLuong());
        System.out.println("nhân viên ca1 đang đi ca: " +ca1.ca);

        //16.
        KeThuaInterface3 kt3 = new KeThuaInterface3();
        KeThuaInterface1 kt1 = new KeThuaInterface1();


        //18. test kế thừa đa hình
        NhanSu ns1 = new PhoPhong();
        //xuất lương phó phòng
        System.out.println(ns1.tinhLuongNS(21));
        //thăng cấp lên trưởng phòng
        ns1 = new TruongPhong();
        //xuất lương trưởng phòng
        System.out.println(ns1.tinhLuongNS(21));
    }
}
