package buildClassInContructor;

public class Test {
    public static void main(String[] args) {
        Studen studen = new Studen();
        studen.setName("Join");
        System.out.println("My name is: " + studen.getName());

        Studen studen1 = new Studen();
        studen1.setClasses("C02");
        System.out.println("My class is: " + studen1.getClasses());

    }
}
