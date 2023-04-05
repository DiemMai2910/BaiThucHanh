package BaiThucHanhLab3;

import java.util.Scanner;

public class nhanVien {
    static Scanner sc = new Scanner(System.in);
    //static Scanner sc = new Scanner(System.in);
    //nhaân viên, họ tên, tuổi, hệ số lương, phương thức nhập thông tin,
    // tính lương = hệ số lương * lương cơ bản. lương cơ bản 1490000, phuong thuc in ra tat ca moi thu,
    String hoten;
    int tuoi;
    final float luongcoban = 1490000f;
    float hesoluong;
    float luong;

    void nhapHoten()
    {
        System.out.print("nhap ho ten nhan vien: ");
        hoten = sc.nextLine();
    }
    void nhapTuoi()
    {
        System.out.print("nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
    }
    void nhaphesoluong()
    {
        System.out.print("nhap he so luong cua nhan vien: ");
        hesoluong = sc.nextFloat();
    }
    void tinhluong()
    {
        luong = hesoluong * luongcoban;
    }
    void inThongtin()
    {
        System.out.printf("Nhan vien co ten la %s, %d tuoi, he so luong la %f, luong la %f", hoten, tuoi, hesoluong, luong );
    }
}
