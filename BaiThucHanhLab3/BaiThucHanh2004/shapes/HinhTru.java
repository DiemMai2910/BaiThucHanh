package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004.shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    
    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru";
    }

    public void nhapChieuCao(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Chieu cao = ");
            chieuCao = sc.nextFloat();
        }
    }

    public void tinhTheTich() {
        theTich = dienTich * chieuCao;
    }

    public void Hienthi() {
        super.Hienthi();
        System.out.printf("Chieu cao = %f, The Tich = %f", chieuCao, theTich);
    }
}
