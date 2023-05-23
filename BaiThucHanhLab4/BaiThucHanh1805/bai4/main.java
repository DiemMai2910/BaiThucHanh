package bai4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        HashSet<TraiCay> arrSet = new HashSet<>();
        List<TraiCay> arrList = new ArrayList<>();
        TraiCay tc = new TraiCay(null);
        Scanner sc = new Scanner(System.in);
        tc.Insert(arrSet);
        tc.Display(arrSet);
        tc.SearchByName(arrSet);
        tc.Delete(arrSet);
        tc.InsertList(arrList);
        tc.InsertListToSet(arrList, arrSet);
    }
}
