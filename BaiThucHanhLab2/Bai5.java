package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int so;
        int tong;
        tong = 0;
        while(tong < 100){
            System.out.println("Nhap vao gia tri so nguyen:");
            so = sc.nextInt();
            tong += so;
        }
        System.out.println("Tong cua cac so nhap vao la:" + tong);
    }
}

