package FizzBuzz;

import static org.junit.Assert.assertEquals;

public class Fizzbuzzz {
    public static void fizzBuzz(int number) {
        if (!checkFizzBuzz(number)){
            if (!checkFizz(number)){
                if (!checkBuzz(number)) checkNum(number);
            }
        }
    }

    private static boolean checkFizzBuzz(int number) {
        boolean isFizz = number %3 == 0;
        boolean isBuzz = number %5 == 0;
        if (isFizz && isBuzz) {
            System.out.println("FizzBuzz");
            return true;
        }
        return false;
    }

    public static boolean checkFizz(int num){
        if (num % 3 == 0) {
            System.out.println("Fizz");
            return true;
        }
        return false;
    }
    public static boolean checkBuzz(int num){
        if (num % 5 == 0) {
            System.out.println("Buzz");
            return true;
        }
        return false;
    }
    public static void checkNum(int num){
        if (num % 3 != 0 && num % 5 != 0){
            System.out.println(num + " k chia hết cho 3 cũng k chia hết cho 5");
        }
    }
}
