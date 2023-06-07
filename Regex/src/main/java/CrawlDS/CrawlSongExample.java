package CrawlDS;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static final String music = "https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html";
    public static void main(String[] args) {
        try {
            URL url = new URL(music);
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));   // tạo một đối tượng Scanner để đọc nội dung
                                                // của URL được cung cấp. Chúng ta sử dụng url.openStream() để mở luồng đầu vào từ URL
                                            // và truyền nó vào đối tượng InputStreamReader để đọc dữ liệu từ luồng này.
            sc.useDelimiter("\\Z");

            String contens = sc.next();  //sử dụng phương thức next() của đối tượng Scanner để đọc nội dung của URL và
                                        // lưu nó vào chuỗi content.
            sc.close();
            contens = contens.replaceAll("\\n+", "");  //sử dụng phương thức replaceAll() để loại bỏ tất cả
                        // các ký tự xuống dòng từ chuỗi content. Biểu thức chính quy "\n+"(+ là:  Xuất hiện 1 hoặc nhiều lần)
                                            // khớp với một hoặc nhiều ký tự xuống dòng và thay thế chúng bằng chuỗi rỗng

            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(contens);  // tạo 1 đối tượng Matcher để so sánh với biểu thức chính quy
            while (matcher.find()){
                System.out.println(matcher.group(1));

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
