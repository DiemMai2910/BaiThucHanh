package BaiThucHanh0203;

import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri tu 2 den 8 vao: ");
        so = scanner.nextInt();
        switch(so){
            case 2 : System.out.println("thu 2"); 
            break;
            case 3 : System.out.println("thu 3");
            break;
            case 4 : System.out.println("thu 4");
            break;
            case 5 : System.out.println("thu 5");
            break;
            case 6 : System.out.println("thu 6");
            break;
            case 7 : System.out.println("thu 7");
            break;
            case 8 : System.out.println("chu nhat");
            break;
            default :System.out.println("khong phai ngay trong tuan");
            break;

        }
    
    }
}
