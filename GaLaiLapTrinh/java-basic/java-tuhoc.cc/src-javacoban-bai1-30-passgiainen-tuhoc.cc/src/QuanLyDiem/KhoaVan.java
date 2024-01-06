package QuanLyDiem;

public class KhoaVan extends NamHoc2023{
    protected double diemVan;
    public KhoaVan(String ten, String cccd, double diemVan) {
        super(ten, cccd);
        this.diemVan = diemVan;
    }
    @Override
    public void tinhDTB() {
        System.out.println("đây là pt tính đtb khoa văn");
        System.out.println("điểm văn = " +diemVan);
    }
}
