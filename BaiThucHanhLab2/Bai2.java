package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("nhap vao so can kiem tra n:");
        n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Day la so chan!");
        }
        else
        {
            System.out.println("Day la so le!");
        }
    }
}
