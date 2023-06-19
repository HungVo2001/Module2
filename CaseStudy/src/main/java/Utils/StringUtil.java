package Utils;

public class StringUtil {
    public static String repeat(String str, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String repeat(String str, int repeat, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(str);
            if (i < repeat - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}
