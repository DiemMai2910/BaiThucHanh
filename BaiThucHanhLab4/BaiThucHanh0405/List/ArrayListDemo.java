package BaiThucHanhLab4.BaiThucHanh0405.List;

import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Student> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Insert(arrList, 0);
        Student.Display(arrList);
    }
}
