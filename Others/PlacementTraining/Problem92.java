package Others.PlacementTraining;

public class Problem92 {
    public static void main(String[] args) {
        int arr[] = {11,10,4,3,8,9};
        int count=1;
        int max=1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1]<arr[i]){
                count++;
            }
            else {
                count=1;
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(max);

    }
}
