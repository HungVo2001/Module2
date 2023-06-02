package TestThrow;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\xxx.aaaa");
            System.out.println("aaaa");
        }catch (FileNotFoundException e){
            System.out.println("File k tôồn tại");
        }
    }
}
