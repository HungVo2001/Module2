package ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AAA {
    private static Pattern pattern;  // Biến này sẽ được sử dụng để lưu trữ một biểu thức chính quy (regular expression)
    // để kiểm tra định dạng email.
    private Matcher matcher;  //Biến này sẽ được sử dụng để thực hiện kiểm tra định dạng email dựa trên biểu thức chính
    // quy đã được lưu trữ trong biến pattern.
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z]+.[a-z]{2,3}$";
    public AAA(){
        pattern = Pattern.compile(EMAIL_REGEX);  //Trong phương thức khởi tạo, biểu thức chính quy EMAIL_REGEX được biên
        // dịch thành một đối tượng Pattern và gán cho biến pattern.
        // Điều này cho phép sử dụng biểu thức chính quy để kiểm tra định dạng email sau này.
    }
    public boolean validate(String regex){  //boolean valida: kiêm tra true false
        matcher = pattern.matcher(regex);  //Công dụng của phương thức matcher là tạo ra một Matcher (đối tượng so khớp)
        // từ biểu thức chính quy regex và pattern đã được tạo trước đó.
        // Đối tượng Matcher được sử dụng để thực hiện các phép so khớp và tìm kiếm trong chuỗi.
        return matcher.matches(); // Phương thức "matches()" này sẽ thực hiện việc so khớp toàn bộ chuỗi regex với mẫu chính quy đã
        // được tạo từ pattern.
    }
}
