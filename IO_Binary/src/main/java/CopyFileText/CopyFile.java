package CopyFileText;

import java.io.*;

public class CopyFile {
    public void copyFile( String sourceFile, String targetFile){
//        do {
            try {

                File sour_file = new File(sourceFile);
                if (!sour_file.exists()) throw new FileNotFoundException("Không co file source ♥♥");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));


                File target_file = new File(targetFile);
                if (!target_file.exists()) throw  new FileNotFoundException("Không co file target ♥♥ ");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));

                int chars;
                int count = 0;
                while (( chars = bufferedReader.read()) != -1){
                    bufferedWriter.write(chars);
                    count++;
                }
                bufferedReader.close();
                bufferedWriter.close();
                System.out.println("File copy thành công có " + count + " ký tự ♥♥");


            }catch (NumberFormatException  e){
                System.err.println("Trong file là chứa chữ nên không thể tính tổng!!");

            } catch (Exception e){
                System.err.println("File không tồn tại ♥♥");
            }
//        }while (true);
    }
}
