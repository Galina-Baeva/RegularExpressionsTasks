import java.util.regex.*;

public class FirstTask {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*");
        Matcher matcher = pattern.matcher("Word cAT DATA A site Java tExt");

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
