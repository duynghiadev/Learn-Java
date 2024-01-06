package Enum;
public class SV {
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;
    //tạo constructor
    public SV(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai=getLoai();
    }
    //tạo getter
    public XepLoai getLoai() {
        if (this.dtb>=8)
            loai=XepLoai.gioi;
        else if (this.dtb>=6.5)
            loai=XepLoai.kha;
        else if (this.dtb>=5.0)
            loai=XepLoai.TB;
        else if (this.dtb>=3.0)
            loai=XepLoai.Yeu;
        else
            loai=XepLoai.DuoiHoc;
        return loai;
    }
    //tostring
    @Override
    public String toString() {
        return ma+"\t" +ten+ "\t" +this.loai.des();
    }
}
