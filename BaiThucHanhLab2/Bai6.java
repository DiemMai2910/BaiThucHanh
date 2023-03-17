package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int so, a = 1;
        long giaithua = 1;
       
        do {
            System.out.println("Nhap vao mot so tu 1 den 10: ");
            so = sc.nextInt();
        } while ((so <= 0)||(so >= 10));
        while (a <= so) {
            giaithua *= a;
            a++;
        }
         
        System.out.println(so + "! = " + giaithua);
    }
}
