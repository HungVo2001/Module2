package Note;

public class NoteInheritance {


    //Kế thừa
//    class  GeometricObject {     // Lớp đc kế thừa : lớp cha ( GeometricObject )
//
//    }
//    class Rectangle extends  GeometricObject {  //Lớp kế thừa : lớp con (Rectangle) đc kế thừa lớp cha (GeometricObject)
//
//    }
//    class Cirle extends GeometricObject {  //Lớp kế thừa : lớp con (Cirle) đc kế thừa lớp cha (GeometricObject)
//
//    }


//    ---------------------------------Ví du:


    public static void main(String[] args) {
        Cirle cirle = new Cirle("dỏ", 5.0);
        cirle.drwa(); // Gọi phương thức tu lop cha
        System.out.println("Diện tích " + cirle.getArea());
        System.out.println("Màu sắc " + cirle.color);  // Truy xuất thuộc tính từ lớp cha

       // ------Override
        System.out.println("--------------");

        Animal animal = new Animal();
        animal.makeSound();   //Kết quả : Âm thanh của đôộng vât

        Cat cat = new Cat();
        cat.makeSound();      //Kết quả : Meo Meo

        Animal anotherAnimal = new Cat();  //Tạo 1 đối tượng Animal nhưng gán cho nó 1 đối tượng Cat sau đó gọi Pt makeSound
        anotherAnimal.makeSound();  // Kết quả vẫn là : Meo Meo. Vì trong trường hợp này, phương thức được gọi là phương thức của lớp con (Cat), do đó phương thức ghi đè được áp dụng.


        System.out.println("----------------");

        //Từ khóa super
        Cat cat1 = new Cat();
        cat1.displayInfo();


    }
}
//Lớp cha ke thua
class Vidu {
    protected String color;
    public Vidu(String color) {
        this.color = color;
    }
    public void drwa() {
        System.out.println("Vẽ hình");
    }
}

//Lớp con kế thừa tu lớp cha:
class Cirle extends Vidu {
    private double radius;

    public Cirle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

}



//-----------------------Ví dụ về Method Override:
//Lớp cha:
class Animal {

    protected String brand;       //Làm về từ khóa super

//    public Animal(String brand) {     //Contructor Anime của lớp cha
//        this.brand = brand;
//    }
    public void makeSound() {
        System.out.println("Tiếng động vật kêu");

    }
    public void displayInfo() {
        System.out.println("Thương hiêu " + brand);  //
    }
}

//Lớp con kế thừa lớp cha và ghi đè Method Override:
class Cat extends Animal {

    private int maxSpeed;        // làm vê từ khóa super



//        public Cat(String brand, int maxSpeed) {      // Contructor của lớp Cat
//        super(brand);          // dùng từ khóa super để gọi contructor của lớp cha và truyên tham số brand. Điều này giuớ khởi tạo thuộc tính brand trong lớp cha
//        this.maxSpeed = maxSpeed;
//    }
    public void displayInfo() {
        super.displayInfo();  //dùng super để gọi PT displayInfo của lop cha.Giúp tái sử dụng mã nguồn trong PT của lớp cha và sau đó thêm các xử lí bổ sung cho lớp con
        System.out.println("Tốc độ tối đa" + maxSpeed + "km/h");
    }
    @Override      //Đánh dấu ghi đè
    public  void makeSound() {
        System.out.println(" Meo Meo");
    }
}

