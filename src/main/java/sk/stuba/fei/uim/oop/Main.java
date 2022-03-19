package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add(0,"bengoro");
        arraylist.add(1,"skr skr");
        for (var i : arraylist){
            System.out.println(i);
        }
        List<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(0,146);
        arraylist2.add(0,0);

        for (var i : arraylist2){
            System.out.println(i);
        }

        ArrayList<pes> pes = new ArrayList<>();
        pes.add(new pes("dunco"));
        pes.add(new pes("bengorbarber"));
        for (var i : pes){
            System.out.println(i);
        }
    }
}
