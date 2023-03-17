package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap ten cua ban: , a = ");
        String a = sc.nextLine();
        System.out.print("Nhap nam sinh cua ban:, b = ");
        int b = sc.nextInt();
        int c = 2023 - b;
        if( c<16){
            System.out.println("Ban "+ a +" o do tuoi vi thanh nien");
        }
        else if ( c >= 16 && c <18 ){
            System.out.print("Ban " + a + " o do tuoi truong thanh");
        }
        else {
            System.out.println(" Ban "+ a + " da gia");
        }
}
}
