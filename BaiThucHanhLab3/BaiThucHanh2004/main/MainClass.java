package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004.main;
import BaiThucHanhLab3.BaiThucHanh2004.shapes.HinhChuNhat;
import BaiThucHanhLab3.BaiThucHanh2004.shapes.HinhTron;
import BaiThucHanhLab3.BaiThucHanh2004.shapes.HinhTru;
import BaiThucHanhLab3.BaiThucHanh2004.shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.Hienthi();

        HinhTru htu = new HinhTru();
        htu.xuatTen();
        htu.nhapBanKinh();
        htu.nhapChieuCao();
        htu.tinhChuVi();
        htu.tinhDienTich();
        htu.Hienthi();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.hienthi();
        
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.hienthi();
    }
}
