public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan= 850; //850$
    //constructor 3 đối số (tên hàm giống tên lớp )
    public NhanVien(String ten, int cccd, String que){
        this.ten= ten;
        this.cccd = cccd;
        this.que = que;
    }
    //phương thức tính lương
    public abstract double tinhLuong();
}
