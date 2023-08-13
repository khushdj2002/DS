package Others.PlacementTraining;

public class Problem79 {
    public static void main(String[] args) {
        int i=1;
        count(i);
    }
    static void count(int n){
        if(n==10){
            return;
        }
        count(++n);
        System.out.println(n);
    }
}
