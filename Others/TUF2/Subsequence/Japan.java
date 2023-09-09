package Others.TUF2.Subsequence;

public class Japan {
    static int max=0;
    public static void main(String[] args) {
        String s = "s.ssss";
        char[] ch = s.toCharArray();
        int a = 0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[j]=='.'){
                a++;
            }
        }
        max=a;
        int k=2;

    }
    static void check(char[] ch,int index,int k,int a){
        if (k==0){
            if (a>max){
                max=a;
            }
        }
        if (index==ch.length){
            return;
        }



    }
    static int count(char[] ch){
        int i=0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[j]=='.'){
                i++;
            }
        }
        return i;
    }
}
