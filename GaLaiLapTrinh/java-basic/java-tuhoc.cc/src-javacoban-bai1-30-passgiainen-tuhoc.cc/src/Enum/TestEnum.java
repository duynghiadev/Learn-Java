package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        //kiểm tra thứ tự các giá trị enum
        System.out.println(XepLoai.gioi.ordinal()); //0
        System.out.println(XepLoai.kha.ordinal());  //1
        //Tạo list ds test
        ArrayList<SV> ds = new ArrayList<SV>();
        //tạo đối tượng sv
        SV sv1 = new SV(1,"nguyễn văn một",9.5);
        SV sv2 = new SV(2,"nguyễn văn hai",4.5);
        SV sv3 = new SV(3,"nguyễn văn ba",7.5);
        //add sinh viên vào list
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        //duyệt ds
        for (SV ttSinhVien: ds){
            System.out.println(ttSinhVien);
        }
    }
}
