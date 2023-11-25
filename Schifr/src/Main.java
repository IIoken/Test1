import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Привет всему Миру";

        Pattern pattern = Pattern.compile("[иеу]");
        Matcher m = pattern.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "ору");
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
