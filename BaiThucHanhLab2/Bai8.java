package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n, tong = 0, so;
        float tbcong;
         
        System.out.println("Nhap vao so nguyen co trong day: ");
        n = sc.nextInt();
    
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhap so thu " + count + ": ");
            so = sc.nextInt();
            tong += so;
        }
         
        tbcong = (float) tong / n;
        System.out.println("Trung binh cong = " + tbcong);
    }
}