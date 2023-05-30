package TestCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hiung");
        arrayList.add("Bao");
        arrayList.add("Quang");
        for (String s : arrayList) {
            System.out.print(s);
        }
        arrayList.remove(0);
        System.out.println();
    }
}
