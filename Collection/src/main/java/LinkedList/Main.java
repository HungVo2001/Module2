package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedLisT<Integer> myLinkedLisT = new MyLinkedLisT<>();
        myLinkedLisT.add(0,9);
        System.out.println(myLinkedLisT);
        myLinkedLisT.add(89);
        myLinkedLisT.add(101);
        myLinkedLisT.addFirst(4545);
        System.out.println(myLinkedLisT.toString());
        myLinkedLisT.remove(3);
//        linkedList.removeFirst();
        System.out.println(myLinkedLisT);
        myLinkedLisT.clear();
        myLinkedLisT.add(1);
        System.out.println(myLinkedLisT);
        System.out.println(myLinkedLisT.checkRemove(4545));
    }
}
