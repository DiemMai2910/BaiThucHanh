package BaiThucHanh2302;

import java.util.Scanner;

public class slide35 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("Nhap so a, a = ");
		int a = scanner.nextInt();
        System.out.println("Nhap so b, b = ");
		int b = scanner.nextInt();
    
        if (a >= b) {
            System.out.println("a lon hon hoac bang b");
        }
        else {
            System.out.println("a be hon b");
        }

    }

}
