package QuanLyDiem;

public class KhoaToan extends NamHoc2023{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }
    @Override
    public void tinhDTB() {
        System.out.println("Đây là pt tính điểm tb khoa toán");
    }
}
