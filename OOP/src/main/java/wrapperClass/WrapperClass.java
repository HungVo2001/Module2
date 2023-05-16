package wrapperClass;

public class WrapperClass {

    public static void main(String[] args) {
        WrapperClass personObj = new WrapperClass("hung",20);
        System.out.println("My name: " + personObj.name);
        System.out.println("Tuôi: " + personObj.age);
        String say = personObj.sayHello();
        System.out.println(say);
        Person person = new Person();
        person.name = "Join";
        System.out.println(person.name);


        //Getter và Setter
        PersonValue personA = new PersonValue();
        personA.setName("VoDuyHung");
        System.out.println("My name is: " + personA.getName());




    }
   //Truy xuất đối tượng
    public WrapperClass(String s, int n) {
         name = s;
         age = n;
    }

    public String name;
    public int age;

    //Gọi phương thức
    public String sayHello() {
        return "Hello AA";
    }


}

//Truy cập trực tiếp vào trường dữ lieeuj
class Person {
    public String name;
}


//Getter và setter:
class PersonValue{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
