public class NhanVienDiCa extends NhanVien{
    //khai báo thêm thuộc tính ca
    //ca 1 : làm ngày
    //ca 2 : làm đêm
    protected int ca;
    public NhanVienDiCa(String ten, int cccd, String que, int ca) {
        //truy xuất từ thuộc tính cha đã có
        super(ten, cccd, que);
        //thêm thuộc tính mới
        this.ca =ca;
    }
    @Override
    public double tinhLuong() {
        return luongCoBan*1.05;
        //đi ca lương tăng 5%
    }
}
