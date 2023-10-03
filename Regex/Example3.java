package Regex;

import java.util.regex.Pattern;

public class Example3 {
    public static void main(String args[]){
        System.out.println(Pattern.matches("[aun0-9]{6}", "aaun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
        String a ="abc";
        String b = "abc";
        System.out.println(a.matches(b));
    }
}
