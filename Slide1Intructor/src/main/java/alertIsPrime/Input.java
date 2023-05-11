package alertIsPrime;

public class Input {
    public static void InputLoop(int numbers) {
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (CheckPrimeNumber.isPrimeNumber(N)) {
                System.out.println(N +"");
                count++;
            }
            N++;
        }
    }
}
