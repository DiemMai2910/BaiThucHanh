package BaiThucHanhLab4.BaiThucHanh0405.List;

import java.util.List;
import java.util.Scanner;

public class Student {
    public String FullName;
    public Int Age;
    public static void NhapThongTin(){
        Scanner sc = new scanner(System.in);
        System.out.println("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    //Phương thức Insert
    public void Insert(List<Student> list, int n)
    {
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            list.add(std);
        }
    }
    //Phương thức Update => by FullName
    public static void UpdateByName(List<Student> arr, String fName)
    {
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).FullName.equals(fName))
            {
                //yeu cau nguoi dung nhap thong tin moi
                Student std = new Student();
                std.NhapThongTin();
                //update
                arr.set(i, std);
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }
    //Phương thức Delete => by FullName
    //Phương thức Display
    public static void Display(List<Student> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.printf("Sinh vien: %s, tuoi: %d", arr.get(i).FullName, arr.get(i).Age)
        }
    }
}
