package String;

public class Permutation {
    public static void main(String[] args) {
        String s = "ab";
        String s2="eidbaooo";
//        int count=0;
        printPermut(s,"",s2);
    }
    static void printPermut(String s, String ans, String s2) {
        if (s.length() == 0) {
            if(s2.contains(ans)){
                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            String ros = s.substring(0, i) + s.substring(i + 1);

            printPermut(ros, ans + ch,s2);
        }
    }
}
