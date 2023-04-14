package BaiThucHanhLab3.BaiThucHanh1404.shapes;

import java.util.Scanner;


public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        ten = " Hình Chữ Nhật ";

    }
    public void nhapChieuDai(){
        System.out.println("Chieu dai = ");
        try (Scanner scanner = new Scanner(System.in)) {
            dai = scanner.nextFloat();
        }

    }
    public void nhapChieuRong(){
        System.out.println("Chieu rong = ");
        try (Scanner scanner = new Scanner(System.in)) {
            rong = scanner.nextFloat();
        }
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai*rong;
    }

}
