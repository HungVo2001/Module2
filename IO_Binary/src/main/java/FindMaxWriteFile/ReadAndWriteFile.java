package FindMaxWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static Scanner sc = new Scanner(System.in);
    public void findMaxInFile (){
//        List<Integer> numbers = new ArrayList<>();
        do {
            try {
                String path = "C:\\codegym\\numbers1.txt" ;
                File file = new File(path);
                if (!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                int max = 0;
                while ((line = bufferedReader.readLine()) != null){
                    if (!line.isEmpty()  && max < Integer.parseInt(line)){
                        max = Integer.parseInt(line);
                    }
                }
                bufferedReader.close();
                System.out.println("Số Max trong file là: " + max);
                writeFile(max);
                break;

            }catch (NumberFormatException  e){
                System.err.println("Trong file là chứa chữ nên không thể tính tổng!!")  ;
                break;
            } catch (Exception e){
                System.err.println("File không tồn tại !!");
            }
        }while (true);
    }

    public void writeFile(int max){

        try {
            String paths = "C:\\codegym\\numbersMax.txt" ;
            FileWriter fileWriter = new FileWriter(paths,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max là: " + max);
            bufferedWriter.close();
            System.out.println("Ghi file thành công tại đường dẫn !!" + paths);
        }catch (Exception e){
            System.err.println("Đường dẫn bi lỗi!!");
        }


    }
}
