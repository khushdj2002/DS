package Others.PlacementTraining;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        char[] ch = s.toCharArray();
        System.out.println(checkPassword(ch,ch.length));
    }
    static int checkPassword(char str[],int n){
        if (str.length<4){
            return 0;
        }
        int cap=0;
        int num=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i]>='0'&&str[i]<='9'){
                num++;
            }
            if (str[i]>='A'&&str[i]<='Z'){
                cap++;
            }
            if (str[i]==' '||str[i]=='/'){
                return 0;
            }
        }
        if(cap==0||num==0){
            return 0;
        }
        if (str[0]>='0'&&str[0]<='9'){
            return 0;
        }
        return 1;
    }
}
