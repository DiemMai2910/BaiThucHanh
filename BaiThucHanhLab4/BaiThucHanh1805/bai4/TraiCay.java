package bai4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TraiCay {
    public String FullName;
    public TraiCay(String FullName) {
        this.FullName = FullName;
    }

    public String getName() {
        return FullName;
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten trai cay : ");
        FullName = sc.nextLine();
    }
    //Phương thức Insert set
    public static void Insert(Set<TraiCay> arrSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua set:");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự newline
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap trai cay thu " +(i+1));
            TraiCay tc = new TraiCay("");
            tc.NhapThongTin();
            arrSet.add(tc);
        }
    }
    public static void Display(Set<TraiCay> arrSet){
        for (TraiCay tc : arrSet){
            System.out.printf("Trai: %s%n ", tc.getName());
        }
    }
    public static void SearchByName(Set<TraiCay> arrSet)
    {
        HashSet<TraiCay> arr = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten trai cay can tim kiem:");
        String fname = sc.nextLine();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(TraiCay tc : arrSet )
        {
            if(tc.getName().equals(fname))
            {
                check = true;
                arr.add(tc);
            }
        }
        if (check) {
            System.out.println("Thong tin trai cay tim kiem :" );
            Display(arr);
          }
        else{
            System.out.println("ket qua nhap khong chinh xac");
        }
    }
    // xóa phần tử 
    public static void Delete(Set<TraiCay> arrSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten trai cay can xoa:");
        String fname = sc.nextLine();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        Iterator<TraiCay> iterator = arrSet.iterator();
        while (iterator.hasNext()) {
            TraiCay tc = iterator.next();
            if (tc.getName().equals(fname)) {
                check = true;
                iterator.remove();
            }
        }
        
        if (check) {
            System.out.println("Thong tin trai cay sau khi xoa:");
            Display(arrSet);
        } else {
            System.out.println("Khong tim thay trai cay can xoa.");
        }
        
    }
    // tạo 1 list cùng kiểu
    public static void InsertList(List<TraiCay> arrList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua list:");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự newline
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap trai cay thu " + (i + 1));
            TraiCay tc = new TraiCay("");
            tc.NhapThongTin();
            arrList.add(tc);
        }
    }    
    // cho list vào set
    public static void InsertListToSet(List<TraiCay> arrList, Set<TraiCay> arrSet) {
        List<TraiCay> tempList = new ArrayList<>(); // Danh sách tạm thời để lưu các phần tử mới
        
        boolean check = false;
        for (TraiCay tc : arrList) {
            check = false; // Đặt lại giá trị của check cho mỗi phần tử trong arrList
            
            for (TraiCay tc1 : arrSet) {
                if (tc.getName().equals(tc1.getName())) {
                    check = true;
                    System.out.println("Thong tin trai cay da co: " + tc.getName());
                    break;
                }
            }
            
            if (!check) {
                tempList.add(tc); // Thêm phần tử vào danh sách tạm thời
                System.out.println("Nhap thanh cong: " + tc.getName());
            }
        }
        
        // Thêm tất cả các phần tử trong danh sách tạm vào arrSet
        arrSet.addAll(tempList);
        System.out.println("HashSet sau khi them cac phan tu cua List:");
        Iterator<TraiCay> iterator = arrSet.iterator();
        while (iterator.hasNext()) {
            TraiCay tc = iterator.next();
            System.out.println("Trai: " + tc.getName());
        }
    }
    
    
}
