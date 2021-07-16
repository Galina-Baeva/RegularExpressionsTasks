import java.util.regex.*;

public class SecondTask {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher("  Removing        Extra Spaces       Between Words in  the             text  ");
        String oneSpaceStr = matcher.replaceAll(" ").replaceAll("^\\s", "").replaceAll("\\s$", "");
        System.out.println(oneSpaceStr);
    }
}
