package BaiThucHanhLab4.BaiThucHanh1805;

import java.util.Scanner;
import java.util.LinkedList;

public class bai2 {
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
        double tbCong;
        DecimalFormat dcf = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
             
        System.out.println("Nhập vào số phần tử của danh sách: ");
        n = sc.nextInt();
             
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            node = sc.nextInt();
            linkedList.add(node);
        }
             
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
                count++;    // biến lưu trữ số các số chẵn
            }
        }
             
        tbCong = (double)sum / count;
        System.out.println("Trung binh cong cua so chan trong danh sach = " + dcf.format(tbCong));
    }
}
