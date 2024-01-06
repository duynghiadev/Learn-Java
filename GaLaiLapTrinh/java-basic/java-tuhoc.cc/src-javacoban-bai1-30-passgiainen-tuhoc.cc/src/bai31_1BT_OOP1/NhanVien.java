package bai31_1BT_OOP1;
public class NhanVien {
    //thuộc tính
    private String ho;
    private String ten;
    private int soSP;
    //constructor
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        this.soSP = soSP;
        //số sp <0 thì gán sp=0
        if (soSP<0)
            this.soSP=0;
    }
    //tạo get, set
    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public int getSoSP() {
        return soSP;
    }
    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    //hàm getLuong
    public double getLuong(){
        double donGia = 0;
        if (this.soSP<=199)
            donGia=0.5;
        else if (this.soSP<=399)
            donGia=0.55;
        else if (this.soSP<=599)
            donGia=0.66;
        else
            donGia=0.65;
        return donGia*this.soSP;
    }

    //hàm lớn hơn
    public  boolean lonHon(NhanVien nhanvien){
        return this.soSP>nhanvien.soSP;
    }
}
