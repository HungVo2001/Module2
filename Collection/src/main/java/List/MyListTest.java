package List;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

for (int i = 0; i < listInteger.getSize(); i++){
    System.out.print(listInteger.get(i) + " ");
        }
        System.out.println();
        listInteger.add(listInteger, 3, 111);

        System.out.println();
        for (int i = 0; i < listInteger.getSize(); i++){
            System.out.print(listInteger.get(i) + " ");
        }



    }
}
