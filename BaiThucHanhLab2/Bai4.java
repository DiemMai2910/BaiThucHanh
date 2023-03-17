package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int so;
        System.out.println("Nhap gia tri tu 1 den 12 vao: ");
        so = sc.nextInt();
        switch(so){
            case 1 : System.out.println("thang 1"); 
            break;
            case 2 : System.out.println("thang 2"); 
            break;
            case 3 : System.out.println("thang 3");
            break;
            case 4 : System.out.println("thang 4");
            break;
            case 5 : System.out.println("thang 5");
            break;
            case 6 : System.out.println("thang 6");
            break;
            case 7 : System.out.println("thang 7");
            break;
            case 8 : System.out.println("thang 8");
            break;
            case 9 : System.out.println("thang 9");
            break;
            case 10 : System.out.println("thang 10");
            break;
            case 11 : System.out.println("thang 11");
            break;
            case 12 : System.out.println("thang 12");
            break;
            default :System.out.println("khong phai thang trong nam");
            break;

        }
    
    }
}
