package bai7;

public class PerfectSquareNumber {
    public static boolean isPerfectSquare(int num){

        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    public static void perfectSquareNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])){
                System.out.println(arr[i] + " Là số chính phương\n");
            }else {
                System.out.println(arr[i] + " Không phai là số chính phươbng");
            }
        }
    }
}
