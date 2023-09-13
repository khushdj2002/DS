package Others.TUF3.LearnBasic.Recursion;

public class REverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printArr(arr, arr.length-1);
    }
    static void printArr(int[] arr,int n){
        if (n==0){
            System.out.println(arr[0]);
            return;
        }
        System.out.println(arr[n]);
        printArr(arr, n-1);
    }
}
