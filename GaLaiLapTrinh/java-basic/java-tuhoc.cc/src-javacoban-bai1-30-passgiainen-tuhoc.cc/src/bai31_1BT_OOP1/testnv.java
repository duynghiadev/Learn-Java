package bai31_1BT_OOP1;

import java.util.Scanner;

public class testnv {
    public static void main(String[] args) {
        NhanVien nv1,nv2;
        //nhập thông tin cho nhân viên 1
        System.out.println("Mời nhập vào thông tin nv1: ");
        System.out.println("Nhập họ: ");
        String honv1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên: ");
        String tennv1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập số sản phẩm: ");
        int spnv1 = new Scanner(System.in).nextInt();
        nv1=new NhanVien(honv1,tennv1,spnv1);


        //nhập thông tin cho nhân viên 2
        System.out.println("Mời nhập vào thông tin nv2: ");
        System.out.println("Nhập họ: ");
        String honv2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên: ");
        String tennv2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập số sản phẩm: ");
        int spnv2 = new Scanner(System.in).nextInt();
        nv2=new NhanVien(honv2,tennv2,spnv2);

        //Tính xuất ra lương từng nhân viên
        System.out.println("Lương của nhân viên 1= " +nv1.getLuong());
        System.out.println("Lương của nhân viên 2= " +nv2.getLuong());

        //So sánh và xuất ra thông báo là sản phẩm của nhân viên nào nhiều hơn
        if (nv1.lonHon(nv2))
        {
            System.out.println("Nhân viên "+nv1.getHo() +" "+nv1.getTen()+ " có số sp nhiều hơn");
            int hieuSoSP = nv1.getSoSP() - nv2.getSoSP();
            System.out.println("Số sp nhiều hơn là: " +hieuSoSP);
        }
        else
        {
            System.out.println("Nhân viên "+nv2.getHo() +" "+nv2.getTen()+ " có số sp nhiều hơn");
            int hieuSoSP = nv2.getSoSP() - nv1.getSoSP();
            System.out.println("Số sp nhiều hơn là: " +hieuSoSP);
        }
    }
}
