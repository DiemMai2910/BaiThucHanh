package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m;
        int n;   
        System.out.println("Nhap so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        n = sc.nextInt();
             
        int A[][] = new int[m][n];
             
        System.out.println("Nhap phan tu cua ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        
        int lonnhat = A[0][0];   
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (lonnhat < A[i][j]) {
                    lonnhat = A[i][j];
                }
            }
        }    
        System.out.println("Phan tu lon nhat trong ma tran = " + lonnhat);
    }
}
