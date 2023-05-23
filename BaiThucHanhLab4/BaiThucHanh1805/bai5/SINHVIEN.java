package bai5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SINHVIEN {
    public String maSV;
    public String hoTen;
    public String lop;

    public SINHVIEN(String maSV, String hoTen, String lop) {
        super();
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
    // nhập thông tin sinh viên
    public  void NhapThongTin() {
        
        // Nhập danh sách n sinh viên
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
         maSV = scanner.nextLine();
        System.out.print("Ho va ten: ");
         hoTen = scanner.nextLine();
        System.out.print("Lop: ");
         lop = scanner.nextLine();
    }
    public static void Insert(Map<String, SINHVIEN> danhSachSV ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự newline
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu:  " +(i+1));
            SINHVIEN SV = new SINHVIEN("","","");
            SV.NhapThongTin();
            danhSachSV.put(SV.getMaSV(), SV);
        }
    }
    // hiển thị 
    public static void inThongTin(Map<String, SINHVIEN> danhSachSV ) {
        System.out.println("Danh sách sinh viên:");
        for (SINHVIEN sv : danhSachSV.values()) {
            System.out.println("ma sinh vien " +sv.getMaSV() + " ho va ten: " + sv.getHoTen() + " Lop:  " + sv.getLop());
        }
    }
    //Nhập tên Lớp từ bàn phím. Hiển thị những sinh viên thuộc Lớp vừa nhập.
    public static void SearchByClass(Map<String, SINHVIEN> danhSachSV){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten lop can tim: ");
        String lop = scanner.nextLine();
        boolean check = false;
        for(SINHVIEN std : danhSachSV.values() ){
            if(std.getLop().equals(lop))
            {
                System.out.println( " Lop:  " + std.getLop() +" ma sinh vien " + std.getMaSV() +" ho va ten: " + std.getHoTen() );
                check = true;
            }
        }
        if (!check) {
            System.out.println("khong co sinh vien thuoc lop " + lop);
        }
    }
    //Nhập Mã sinh viên từ bàn phím. Hiển thị họ tên và Lớp tương ứng.
    public static void SearchByMSV(Map<String, SINHVIEN> danhSachSV){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap MSV can tim: ");
        String  Ma= scanner.nextLine();
        boolean check = false;
        for(SINHVIEN std : danhSachSV.values() ){
            if(std.getMaSV().equals(Ma))
            {
                System.out.println("ma sinh vien " + std.getMaSV() +" ho va ten: " + std.getHoTen() + " Lop:  " + std.getLop() );
                check = true;
            }
        }
        if (!check) {
            System.out.println("khong co sinh vien co ma sinh vien la : " + Ma);
        }
    }



}


