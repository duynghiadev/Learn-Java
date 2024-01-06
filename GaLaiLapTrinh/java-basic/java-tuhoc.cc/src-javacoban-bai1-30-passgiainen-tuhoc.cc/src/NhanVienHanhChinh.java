public class NhanVienHanhChinh extends NhanVien{
    //nhấn Alt + shift + enter
    public NhanVienHanhChinh(String ten, int cccd, String que) {
        super(ten, cccd, que);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
