package Others.TUF.DP;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s2 = "acjkp";
        String res = "";
        System.out.println(check(s1,s2,0,res));
    }
    static String check(String s1,String s2,int index,String res){
        if (index==s1.length()){
            return "";
        }
        return "";
    }
}
