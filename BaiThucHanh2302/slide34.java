package BaiThucHanh2302;

import java.util.Scanner;

public class slide34 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Nhap so a, a = ");
        float a = slide34.scanner.nextFloat();
        System.out.println("Nhap so b, b = ");
        float b = slide34.scanner.nextFloat();
        System.out.println("Nhap so c, c = ");
        float c = slide34.scanner.nextFloat();
        slide34.giaiPTBac2(a, b, c);
    }
        public static void giaiPTBac2(float a, float b, float c) {
            // kiểm tra các hệ số
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vo nghiem!");
                }
                else {
                    System.out.println("Phuong trinh co 1 nghiem: "
                            + "x = " + (-c / b));
                }
                return;
            }
            // tính delta
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            // tính nghiệm
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phuong trinh co 2 nghiem: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } 
            else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep: "
                        + "x1 = x2 = " + x1);
            } 
            else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }  
}
