package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004.shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron(){
        ten = " Hinh Tron";
    }

    public void nhapBanKinh(){
        System.out.println("Ban kinh = ");
        try (Scanner sc = new Scanner(System.in)) {
            banKinh = sc.nextFloat();
        }
    

    }

    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }
    public void Hienthi() {
        System.out.printf("Ban kinh = %f, Chu Vi = %f, Dien Tich = %f", banKinh, chuVi, dienTich);
    }
}

