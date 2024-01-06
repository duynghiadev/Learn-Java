package Enum;
public enum XepLoai {
    gioi ("Giỏi"),   //0
    kha("Khá"),    //1
    TB("Trung Bình"),     //2
    Yeu("Yếu"),    //3
    DuoiHoc ("Đuổi học")//4
    ;
    //tạo constructor
    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }
    //
    public String des()
    {
        return this.msg;
    }
}
