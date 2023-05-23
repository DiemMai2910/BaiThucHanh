package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<SINHVIEN> arrList = new ArrayList<>();
        SINHVIEN std = new SINHVIEN(null, 0);
        Scanner sc = new Scanner(System.in);;
        std.Insert(arrList);
        std.inThongTin(arrList);
        std.SinhVienThiLai(arrList);
        std.DiemCaoNhat(arrList);
        std.SearchByName(arrList);
    }
}
