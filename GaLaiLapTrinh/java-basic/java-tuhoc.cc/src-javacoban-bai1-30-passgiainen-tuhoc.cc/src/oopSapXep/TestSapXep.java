package oopSapXep;

import java.util.ArrayList;
import java.util.Collections;

public class TestSapXep {
    public static void main(String[] args) {
        //tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khởi tạo sản phẩm
        SanPham sp1 = new SanPham(1,"samsung",1050);
        SanPham sp2 = new SanPham(2,"iphone",500);
        SanPham sp3 = new SanPham(3,"hocamdao",800);
        //add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //xem danh sách sp trong danh sách list
        for (SanPham sp: ds){
            System.out.println(sp);
        }
        //gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("ds sp sau sx: ");
        for (SanPham sp: ds){
            System.out.println(sp);
        }

    }
}
