package ReveserArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = {3,6,111,222,6};
        ReverserStack.reverseInArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(ReverserStack.reverseString("Born To Shine"));



    }
}
