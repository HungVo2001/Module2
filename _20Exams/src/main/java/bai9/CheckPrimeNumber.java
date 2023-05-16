package bai9;

public class CheckPrimeNumber {
    public void countPrimeInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (checkPrimeNumber(arr[i])) System.out.println("Vị trí " + i + " : " + arr[i] + " là số nguyên tố");
        }
    }

    public static boolean checkPrimeNumber(int number){
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
