package ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static Pattern pattern;
    public Matcher matcher;
    public static final String ACCOUNT_REGEX = "^[a-z0-9_]{6,}$";
    public AccountExample(){

    }
    public boolean validate(String regex){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
