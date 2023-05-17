package note;

public class Note {
//    //ví dụ : Reference data type : Kiểu dữ liệu tham chiếu
//    public String name;
//    public static void main(String[] args) {
//
//        Note a = new Note("Join");
//        Note b = new Note("Bill");
//        swap(a,b);
//        System.out.println("a.name = " + a.name);
//        System.out.println("b.name = " + b.name);
//    }
//    public static void swap(Note first, Note second) {
//        String temp = first.name;
//        first.name = second.name;
//        second.name = temp;
//    }
//    public Note(String name) {
//        this.name = name;
//    }
//------------------------------------------------

    //Static property : thuộc tính static
//    public static String language = "english"; //Khai báo biến static
//
//    public static void main(String[] args) {
//        System.out.println("Current langue: "+ Note.language); //Truy xuất biến static
//    }



    //------------------------------------------

    //Static Method : phương thức static

//    public static String getVersion() {     //Khai báo phương thức static
//        return "1.0";
//    }
//    public static void main(String[] args) {
//        System.out.println("Curren Version: " + Note.getVersion());  //Gọi phương thức static
//    }


//    public static String languega ;
//    static {
//        if (System.getProperty("lang").equals("en")){
//            languega = "english";
//        }else {
//            languega = "spanish";
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Current langues: " + Note.languega);
//    }



    //----------------------------
    //Từ khóa import


//
//    import model.Note;
//    public class CustomerController {
//        public void index(){
//            Note customer = new Note();
//        }
//    }



   // --------------------------------
    //Getter va Setter
   public static void main(String[] args) {
       PersonValue person = new PersonValue();
       person.setName("Hung");
       System.out.println("Name is: " + person.getName());
   }


}
class PersonValue{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
