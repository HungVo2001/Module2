package studen;

public class Studen {
    private int roln;
    private String name;
    private static String college = "BBID";

    Studen(int r, String n) {
        roln = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(roln + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Studen.change();

        Studen s1 = new Studen(123,"Hung");
        Studen s2 = new Studen(234,"Bao");
        Studen s3 = new Studen(345,"Dat");

        s1.display();
        s2.display();
        s3.display();
    }
}
