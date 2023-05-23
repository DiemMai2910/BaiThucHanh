package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SINHVIEN {
    public String FullName;
    public float score;

    public SINHVIEN(String FullName, float score) {
        this.FullName = FullName;
        this.score = score;
    }

    public String getName() {
        return FullName;
    }

    public float getScore() {
        return score;
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        FullName = sc.nextLine();
        System.out.println("Nhap diem: ");
        score = sc.nextFloat();
    }

    // Phương thức Insert list
    public static void Insert(List<SINHVIEN> arrList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong danh sach:");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự newline
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu  " + (i + 1));
            SINHVIEN std = new SINHVIEN("", 0);
            std.NhapThongTin();
            if (std.getName().isEmpty()) {
                break;
            }
            arrList.add(std);
        }
    }

    public static void inThongTin(List<SINHVIEN> arrList) {
        for (SINHVIEN student : arrList) {
            System.out.printf("Ho ten: %s, diem: %.2f%n", student.getName(), student.getScore());
        }
    }

    // Đếm số sinh viên phải thi lại và hiển thị thông tin của những sinh viên đó
    public void SinhVienThiLai(List<SINHVIEN> arrList) {
        ArrayList<SINHVIEN> SinhVienThiLai = new ArrayList<>();
        for (SINHVIEN std : arrList) {
            if (std.getScore() <= 5) {
                SinhVienThiLai.add(std);
            }
        }
        System.out.println("So sinh vien phai thi lai la: " + SinhVienThiLai.size());
        if (SinhVienThiLai.size() > 0) {
            System.out.println("Thong tin sinh vien thi lai:");
            inThongTin(SinhVienThiLai);
        }
      }
      // hien thi sinh vien có điểm cao nhất
      public void DiemCaoNhat(List<SINHVIEN> arrList){
        ArrayList<SINHVIEN> max = new ArrayList<>(); 
        float max1 = Float.MIN_VALUE;
        for(SINHVIEN std : arrList){  
                // nếu kết quả của phép so sánh này lớn hơn 0
                // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
                // thì gán max = phần tử tại vị trí i
                // và đó chính là phần tử lớn nhất
                if (std.getScore() > max1) {
                  max1 = std.getScore();
                }
                
            }
        for (SINHVIEN std : arrList) {
            if (std.getScore() == max1) {
                max.add(std);
             }
          }
        if (max.size() > 0) {
            System.out.println("Phan tu lon nhat trong arrList = " );
            inThongTin(max);
      }
    }
      //tìm kiếm thông tin theo name
      public static void SearchByName(List<SINHVIEN> arrList)
        {
          ArrayList<SINHVIEN> search = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten can tim kiem:");
            String fname = sc.nextLine();
            boolean check = false;
            //kiemtra phan tu thu i co FullName co = gia tri fName
            for(SINHVIEN student : arrList)
            {
                if(student.getName().equals(fname))
                {
                    check = true;
                    search.add(student);
                }
            }
            if (check) {
              System.out.println("Thong tin sinh vien tim kiem: " );
              inThongTin(search);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
    }
}



