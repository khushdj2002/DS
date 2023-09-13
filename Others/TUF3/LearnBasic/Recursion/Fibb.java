package Others.TUF3.LearnBasic.Recursion;

public class Fibb {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fibb(n));
    }
    static int fibb(int n){
        if (n<2){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
}
