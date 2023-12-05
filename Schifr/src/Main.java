import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Привет Мир"
        System.out.println(isSifr(text));
        System.out.println(isObr(isSifr(text)));
    }

    private static String isSifr(String text) {
        Pattern pattern = Pattern.compile("и");
        Matcher m = pattern.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "ору");
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private static String isObr(String isSifr) {
        Pattern pattern = Pattern.compile("ору");
        Matcher m = pattern.matcher(isSifr);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "и");
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
