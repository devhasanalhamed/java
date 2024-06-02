import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example23 {
//    Regex
    /*
    A regular expression is a sequence of characters that forms a search pattern.

    Pattern Class - Defines a pattern (to be used in a search)
    Matcher Class - Used to search for the pattern
    PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

     */

    public static void main(String[] args) {
        String text = "-h2@gmail.com";
        Pattern pattern = Pattern.compile("^[A-Z0-9.%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match Not Found!");
        }
    }
}
