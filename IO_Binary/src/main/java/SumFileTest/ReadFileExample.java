package SumFileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExampleS(){
        Scanner sc = new Scanner(System.in);
        do {
            try {
                String path = "C:\\codegym\\Module2\\IO_Binary\\src\\main\\java\\data\\Sum.txt";
                System.out.println("Nhập đường dẫn file");
                //Đọc file theo đường dẫn
                File file = new File(path);

                // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
                if (!file.exists()){
                    throw new FileNotFoundException();
                }

                /// Đọc từng dòng của file và tiến hành cộng tổng lại
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = bufferedReader.readLine()) != null){  //đọc qua từng dòng đến dòng null thì thoát khỏi while
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                bufferedReader.close();  // khi đọc file thì phải kết thúc file thì mới in ra note trong file đó.
                                         // nếu k có PT cloe() thì in ra file rỗng
                System.out.println("Tổng là : " + sum);


                break;

            }catch (NumberFormatException  e){
                System.err.println("Trong file là chứa chữ nên không thể tính tổng!!");
                break;
            } catch (Exception e){
               System.err.println("File không tồn tại!!");
            }
        }while (true);

    }
}
