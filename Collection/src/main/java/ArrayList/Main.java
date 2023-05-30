package ArrayList;

public class Main<E> {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println(myList.size());
        myList.add(4);
        myList.add(9);
        System.out.println(myList);
        myList.add(0,8);
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.Clone());
        System.out.println(myList.contains(9));
        System.out.println(myList.indexOf(9));
    }
}
