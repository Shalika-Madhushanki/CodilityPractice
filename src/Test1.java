import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public String solution(String s) {

        String st = "my name is shalika. my age is 28, i like to play cricket. I love to explore the world!.";
        String[] str = st.split("\\.");
        System.out.println(Arrays.toString(str));
        //replace plus
        Pattern plusPattern = Pattern.compile("plus");
        String replacement = "+";
        Matcher plusMatcher = plusPattern.matcher(s);
        String modifiedStringWithPlus = plusMatcher.replaceAll(replacement);

        //replace minus
        Pattern minusPattern = Pattern.compile("minus");
        String minusReplacement = "-";
        Matcher minusMatcher = minusPattern.matcher(modifiedStringWithPlus);
        String modifiedStringWithMinus = minusMatcher.replaceAll(minusReplacement);


        return modifiedStringWithMinus;
    }
}
