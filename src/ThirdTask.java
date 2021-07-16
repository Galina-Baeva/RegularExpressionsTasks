import java.util.regex.*;

public class ThirdTask {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w*(\\w)\\1\\w*");
        Matcher matcher = pattern.matcher("password home wword word Heeeeeeello hat bone");
        String noDoubleStr = matcher.replaceAll("").replaceAll("\\s+", " ").replaceAll("^\\s", "").replaceAll("\\s$", "");
        System.out.println(noDoubleStr);
    }
}
