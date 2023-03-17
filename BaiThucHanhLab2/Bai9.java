package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap chuoi bat ky: ");
        String chuoi = sc.nextLine();
        int chuHoa = 0;
        int chuThuong = 0;
        int so = 0;
        for ( int i =0; i< chuoi.length(); i++)
        {
            char kiTu = chuoi.charAt(i);
            if (Character.isUpperCase(kiTu)) 
            {
                chuHoa++;
            } 
            else if (Character.isLowerCase(kiTu)) 
            {
                chuThuong++;
            } 
            else if (Character.isDigit(kiTu)) 
            {
                so++;
            }
        }
        System.out.println("Chuoi " + chuoi + " co:");
        System.out.println(chuHoa + " ky tu in hoa");
        System.out.println(chuThuong + " ky tu in thuong");
        System.out.println(so + " ky tu so");
    }
}
