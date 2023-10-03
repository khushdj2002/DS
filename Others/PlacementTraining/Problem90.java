package Others.PlacementTraining;

public class Problem90 {
    public static void main(String[] args) {
        String binary = "1011";
        System.out.println(count(binary));
    }
    static int count(String binary){
        int decimal = Integer.parseInt(binary,2);
        int count=0;
        while (decimal!=0){
            if (decimal%2==0){
                decimal=decimal/2;
            }
            else{
                decimal--;
            }
            count++;
        }
        return count;
    }
}
