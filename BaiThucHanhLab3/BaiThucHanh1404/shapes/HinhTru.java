package BaiThucHanhLab3.BaiThucHanh1404.shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    
    public float chieuCao;

    public HinhTru(){
        ten = "Hình Trụ";
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chiều cao = ");
        try (Scanner scanner = new Scanner(System.in)) {
            chieuCao = scanner.nextFloat();
        }
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
