package QuanLyDiem;

public class NamHoc2023 {
    protected String ten;
    protected String cccd;
    //alt + insert thêm constructor
    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }
    //phương thức class cha
    public void tinhDTB(){
        System.out.println("Đây là pt tính dtb của class cha");
    }
}
