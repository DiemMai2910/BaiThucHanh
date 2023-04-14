package BaiThucHanhLab3.BaiThucHanh2303;

import java.util.Scanner;


public class hinhTruTron {
    static Scanner sc = new Scanner(System.in);
    float banKinh;
    final float Pi = 3.14f;
    float chieuCao;
    float dienTichXungQuanh;
    float dienTichToanPhan;
    float theTich;

    void nhapBanKinh()
    {
        System.out.print("Nhap ban kinh r = ");
        banKinh = sc.nextFloat();
    }
    void nhapChieuCao()
    {
        System.out.print("Nhap chieu cao h = ");
        chieuCao = sc.nextFloat();
    }
    
    void tinhDienTichXungQuanh()
    {

            dienTichXungQuanh = 2 * Pi * banKinh *chieuCao;
    }
    void tinhDienTichToanPhan()
    {
            dienTichToanPhan = 2 * Pi * banKinh * (chieuCao + banKinh);
    }
    void tinhTheTich()
    {
            theTich = Pi * banKinh * banKinh * chieuCao;
    }
    void inThongTin()
    {
        System.out.printf("Hinh tru tron co r la %f, h la %f, dien tich xung quanh la %f dien tich toan phan la %f, the tich la %f", banKinh, chieuCao, dienTichXungQuanh, dienTichToanPhan, theTich);
    }
}
