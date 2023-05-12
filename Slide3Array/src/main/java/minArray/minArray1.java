package minArray;

public class minArray1 {
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,0,6};
        int index = minArray(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là :" + arr[index]);


    }
    public static int minArray(int [] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
