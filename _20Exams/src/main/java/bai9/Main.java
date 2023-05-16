package bai9;

public class Main {
    //Đếm số nguyên tố trong mảng


    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,10,123,125124,12,17,19,21,24,777,23,26,29};
        for (int num : arr){
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        checkPrimeNumber.countPrimeInArray(arr);
    }
}
