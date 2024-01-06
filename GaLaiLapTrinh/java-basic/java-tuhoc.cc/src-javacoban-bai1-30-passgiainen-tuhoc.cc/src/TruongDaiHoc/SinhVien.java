package TruongDaiHoc;

public class SinhVien {
    //thuộc tính ( giống với biến )
    private String hoTen;
    private double diem;


    //4.2 constructor có đối số
    public SinhVien(String hoTen,double diem)
    {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //phương thức ( các hàm )
    //phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+" : "+diem);
    }
    //phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }
    //hàm đặc biệt toString : Alt +INS chọn toString
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //4.1 constructor mặc định
    //khởi tạo các giá trị mặc định
    // ngay khi đối tượng vừa được tạo ra
    public SinhVien()
    {
        hoTen="No name";
        diem=0.0;
    }

    //8.1 set (pvs) hoặc tổ hợp phím Alt + INS
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //8.2 . get
    public String getHoTen() {
        return hoTen;
    }
    public double getDiem() {
        return diem;
    }

    //11. Support Method và Service Method
    //11.1 Support Method
    //ktra điểm khi nhập hồ sơ cho sinh viên
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //11.2 service method có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if (checkDiem())
            System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin..");
        else
            System.out.println("Ktra lại điểm thi đại học đầu vào ? ");
    }

    //12. Overloading Method
    public double TinhDiemTB(double toan, double van, double anh){
        return (toan+van+anh)/3;
    }
    public double TinhDiemTB(double toan, double van, double anh, double sinh){
        return (toan+van+anh+sinh)/4;
    }
    //13. Parametter List Method
    public double TongDiem(double ... arr){
        double tong = 0.0;
        for (double x :arr){
            tong+=x;
        }
        return tong;
    }

}

