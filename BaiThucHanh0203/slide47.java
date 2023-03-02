package BaiThucHanh0203;

import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) 
    {
        int number ,
        sum = 0;
        Scanner sc = new Scanner(System.in);

        while (sum > 100) {
            System.out.println("Nhap gia tri vao: ");
            number = sc.nextInt(); 
            sum += number;
        
        }
        System.out.println("Tong cua"  + sum);
    }
}
