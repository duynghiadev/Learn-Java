public class SinhVienCungPk {
    //thuộc tính ( giống với biến )
     String hoTen;
    double diem;

    //4.2 constructror có đối số
    public SinhVienCungPk(String hoTen, double diem)
    {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    //phương thức ( các hàm )
    public void hienThiThongTin(){
        System.out.println(hoTen+" : "+diem);
    }

    //4.1 constructor mặc định
    //khởi tạo các giá trị mặc định
    // ngay khi đối tượng vừa được tạo ra
    public SinhVienCungPk()
    {
        hoTen="No name";
        diem=0.0;
    }


}
