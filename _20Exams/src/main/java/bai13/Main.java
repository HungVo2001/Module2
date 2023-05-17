package bai13;

import static bai13.ArrInside.isInSideArray;

public class Main {
    // Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5};
        int[] arrB = {6,5,4,3,2,1,10};

        System.out.println(isInSideArray(arrA, arrB));
    }
}
