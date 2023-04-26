package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004.shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong(){
        ten = " Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.println("Canh = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }
    public void hienthi() {
        super.hienthi();
    }
}
