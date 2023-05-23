package bai5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class main {
    public static void main(String[] args) {
    Map<String, SINHVIEN> danhSachSV = new HashMap<String, SINHVIEN>();
    SINHVIEN std = new SINHVIEN(null, null, null);
    std.Insert(danhSachSV);
    std.inThongTin(danhSachSV);
    std.SearchByClass(danhSachSV);
    std.SearchByMSV(danhSachSV);
    }
}
