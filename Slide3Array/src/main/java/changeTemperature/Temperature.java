package changeTemperature;

import java.util.Scanner;

//Công thức chuyển đổi:
//
//               celsius = (5.0 / 9) * (fahrenheit - 32)
public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double celsius,fahrenheit;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius: ");
            System.out.println("2. Celsius to Fahrenheit:");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the Fahrenheit: ");
                    fahrenheit = Double.parseDouble(sc.nextLine());
                    System.out.println("Fahrenheit To Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter the Celsius: ");
                    celsius = Double.parseDouble(sc.nextLine());
                    System.out.println("Celsius To Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        }while (choice != 0);

    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }
}
