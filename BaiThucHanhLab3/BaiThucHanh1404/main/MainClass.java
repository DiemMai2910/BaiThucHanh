package BaiThucHanhLab3.BaiThucHanh1404.main;

import BaiThucHanhLab3.BaiThucHanh1404.shapes.HinhChuNhat;
import BaiThucHanhLab3.BaiThucHanh1404.shapes.HinhTron;
import BaiThucHanhLab3.BaiThucHanh1404.shapes.HinhTru;
import BaiThucHanhLab3.BaiThucHanh1404.shapes.HinhVuong;

public class MainClass {
    public static void main(String[] arg) {
        // Thử nghiệm với lớp Hình tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
        //Thử nghiệm với lớp Hình trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        //Thử nghiệm với Hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        //Thử nghiệm với lớp Hình Vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    } 
}
