package bai14;

public class Main {
    // Kiểm tra ma trận 2 chiều có toàn dương hay không
    public static void main(String[] args) {
        ArraMatrix arraMatrix = new ArraMatrix();
        int[][] arr = {
                {3,4,5},
                {1,2,5},
                {6,4,3}
        };
        boolean isMatrix = arraMatrix.arraMaTrix(arr);
        System.out.println("Ma trận 2 chiều có toan dương không?\n " + isMatrix);

    }
}
