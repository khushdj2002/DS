package Others.TUF3.LearnBasic.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int m =5;
        int n =5;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j){
                    count++;
                    char c = (char) ('A'+j);
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
