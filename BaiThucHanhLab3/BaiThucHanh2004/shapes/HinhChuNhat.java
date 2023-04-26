package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004.shapes;

import java.util.Scanner;


public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        ten = " Hinh Chu Nhat ";

    }
    public void nhapChieuDai(){
        System.out.println("Chieu dai = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = sc.nextFloat();
        }

    }
    public void nhapChieuRong(){
        System.out.println("Chieu rong = ");
        try (Scanner sc = new Scanner(System.in)) {
            rong = sc.nextFloat();
        }
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai*rong;
    }
    public void hienthi() {
        System.out.printf("Chieu Dai = %f, Chieu Rong = %f, Chu vi = %f, Dien Tich = %f", dai, rong, chuVi, dienTich);
    }

}
