import java.util.Scanner;

/**
 * author BURCU AYHAN
 */
import java.util.ArrayList;
import ArrayOrganizer.java;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(500);
        list1.add(900);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(800);
        list1.add(600);
        list1.add(300);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list1.add(400);
        list1.add(700);
        list1.add(200);
        ArrayOrganizer a;
        ArrayList<Integer> b = a.concatAndSort(list1, list2, list3);
        System.out.println(b);
    }
}