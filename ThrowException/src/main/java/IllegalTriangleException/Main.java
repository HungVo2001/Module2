package IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double side1,side2,side3;


            try {
                System.out.println("Nhập side1: ");
                side1 = getNumber();
                System.out.println("Nhập side2: ");
                side2 = getNumber();
                System.out.println("Nhập side3: ");
                side3 = getNumber();
                Triangle triangle = new Triangle();
                triangle.triangleException(side1,side2,side3);
            }catch (Exception e){
                System.out.println("Sai định dạng. Vui lòng nhập đung định dạng!!");
            }
//

    }

    public static double getNumber(){
        do {
          try {
              double number = Double.parseDouble(sc.nextLine());
             if (number > 0){
                 return number;
             }
          }catch (Exception e){
              System.out.println("Vui lòng nhập đúng định dạng số");
          }

        }while (true);
    }
}
