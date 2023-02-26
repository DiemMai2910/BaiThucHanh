package BaiThucHanh2302;

import java.util.Scanner;

public class slide30 {
    public static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;

    public static void main(String[] args)
    {
         System.out.println("Nhap so n = ");
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac chu so "
                + " %d là: %d", n, tongcacchuso(n));
    }
    public static int tongcacchuso(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
    

}

