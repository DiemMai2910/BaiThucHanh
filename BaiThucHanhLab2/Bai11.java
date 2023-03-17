package BaiThucHanhLab2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu i "+ i + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println(" mang ban dau la : " + Arrays.toString(A));
        int[] mangTangDan = Arrays.copyOf(A, A.length);
        // viet lai mang theo thu tu tang dan
        for ( int i = 0; i < mangTangDan.length - 1 ; i++){        
            for (int j = i + 1; j < mangTangDan.length ; j++){
                int temp = mangTangDan[i];
                if( mangTangDan[i] > mangTangDan[j]){
                    mangTangDan[i] = mangTangDan[j];
                    mangTangDan[j] = temp;
                }
                
            }
        } 
        System.out.println("Mang sap xep tang dan la : " + Arrays.toString(mangTangDan));
    }
}
