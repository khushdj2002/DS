package Regex.HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        String pattern = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(test);
        int count=0;
        while (m.find()){
            count++;
        }
        System.out.println(count);
    }
}
