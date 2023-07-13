import java.util.HashSet;
import java.util.Scanner;

public class BuddyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        if (buddyStrings(s,goal)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean buddyStrings(String s,String goal){
        if (s.length()!=goal.length()){
            return false;
        }
        if (s.equals(goal)){
            HashSet<Character> hset = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (hset.contains(s.charAt(i))){
                    return true;
                }
                else{
                    hset.add(s.charAt(i));
                    if(i==s.length()-1){
                        return false;
                    }
                }
            }
        }
        else{
            int check=0;
            char st='1';
            char en='1';
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=goal.charAt(i)){
                    ++check;
                    if (check>2){
                        return false;
                    }
                    if(check==2){
                            if(st!=goal.charAt(i)||en!=s.charAt(i)){
                                return false;
                            }
                    }
                    else{
                        st=s.charAt(i);
                        en=goal.charAt(i);
                    }

                }
            }
            if (check==2){
                return true;
            }
        }
        return false;
    }
}
