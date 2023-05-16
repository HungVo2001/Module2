package bai3;

public class Main {
    //Đưa các số chia hết cho 3 về đầu mảng
    public static void main(String[] args) {
        String find = "adabbcc";
        String output = " ";

        char kyTuTruoc = find.charAt(0);
        int count = 1;
        for (int i = 1; i < find.length(); i++) {
             char kyTuSau = find.charAt(i);

             if (kyTuTruoc != kyTuSau){
                 output += kyTuTruoc + Integer.toString(count);


                 kyTuTruoc = kyTuSau;
                 count = 1;
             } else {
                 count++;
             }
        }
        output += kyTuTruoc + Integer.toString(count);


        System.out.println(output);
    }
}
