package BaiThucHanhLab3.BaiThucHanh1404.shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong(){
        ten = " Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
