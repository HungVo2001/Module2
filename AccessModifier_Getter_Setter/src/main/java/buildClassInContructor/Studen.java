package buildClassInContructor;

public class Studen {
    private String name;
    private String classes;

    public Studen() {

    }
    protected void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }
    protected void setClasses(String c){
        this.classes = c;
    }
    public String getClasses() {
        return this.classes;
    }


}
