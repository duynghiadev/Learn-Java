public interface ViDuInterface {
    //tập các thuộc tính (chỉ được phép là hằng số)
    static final double phuCap = 15; //15$
    //tập các phương thức ( không có phần body)
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
