package String;

public class InsertionPalindrome {
    public static void main(String[] args) {
        String s = "zjveiiwvc";
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (sb.lastIndexOf(""+c)!=i){
                sb.deleteCharAt(i);
                sb.deleteCharAt(sb.lastIndexOf(""+c));
                i--;
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }

}
