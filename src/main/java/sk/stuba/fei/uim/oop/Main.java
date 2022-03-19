package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> list= new ArrayList<>();
        for (int i =0;i<4;i++){
            String s = scanner.next();
            list.add(s);
        }
        for (var i : list){
            System.out.println(i);
        }
    }
}
