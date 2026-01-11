package regularExpression;

import java.util.regex.Pattern;

public class RegularExpressionDemo {
    static void main() {
//        String pattern = "[a-z]+[A-Z]+[0-9]+";
        // another way
        String pattern = "^[a-z]+[A-Z]+[0-9]+$";
        // * for 0 or more Occurance
        // + for 1 or more
        // {min, max} or {exact number}
        // [a-z]
        // w for word

        String input = "aaabbbbccaaabccA0";
        var test = Pattern.matches(pattern,input);
        System.out.println(test);

    }
}
