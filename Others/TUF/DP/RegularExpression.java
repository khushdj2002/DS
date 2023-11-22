package Others.TUF.DP;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(isMatch("ab",".*"));
    }
    static  public boolean isMatch(String s, String p) {
            return isMatch(s,p,0,0);
        }
    static public boolean isMatch(String s,String p,int i, int j){
            if(i>=s.length() && j>=p.length()){
                return true;
            }
            if(j>=p.length()){
                return false;
            }
            boolean charMatch= i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j) == '.');
            if(j+1<p.length() && p.charAt(j+1)=='*'){
                return isMatch(s,p,i,j+2) || charMatch && isMatch(s,p,i+1,j);
            }else if(charMatch){
                return isMatch(s,p,i+1,j+1);
            }
            return false;
        }
    }

