package Regex.HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {
    public static void main(String[] args) {
        String testString = "123.456.abc.def";
        String pattern = "[\\w\\d]{3}(.)[\\w\\d]{3}(.)[\\w\\d]{3}(.)[\\w\\d]{3}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match =m.matches();
        System.out.println(match);
    }
}
