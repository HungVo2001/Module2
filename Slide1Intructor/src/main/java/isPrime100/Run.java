package isPrime100;

public class Run {
    public static void Runtime() {
        int number = InputNum.inputNumber();
        if (number >= 2) {
            System.out.print(2 + " ");
        }
        for (int i = 3; i < number; i += 2) {
            if(IsPrimeNumber.isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
