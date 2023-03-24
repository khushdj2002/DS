package Map.HashMap;

import java.math.BigInteger;
import java.util.Arrays;

public class Simply_String {
//    public static void main(String[] args) {
//        String num1="6913259244";
//        String num2="71103343";
////        long a = Integer.parseInt(num1);
////        long b = Integer.parseInt(num2);
//        String arr[] = new String[num1.length()];
//        for (int i = 0; i < num1.length(); i++) {
//            arr[i]="";
//            for (int j = 0; j < i; j++) {
//                arr[i]+="0";
//            }
//        }
////        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < num1.length(); i++) {
//            Character val1 = Character.valueOf(num1.charAt(num1.length()-i-1));
//            int val11 = Integer.parseInt(""+val1);
////            System.out.println(val1);
//            StringBuilder sb = new StringBuilder(arr[i]);
//            int carry=0;
//            for (int j = 0; j < num2.length(); j++) {
//                Character val2 = Character.valueOf(num2.charAt(num2.length()-j-1));
//                int val22 = Integer.parseInt(""+val2);
////                System.out.println(val2);
//
//                    int a = val11*val22+carry;
////                System.out.println(a);
//                    carry=a/10;
//                    a=a%10;
//                    sb.append(a);
////                System.out.println(a+"  "+carry+" "+val1+" "+val2);
//            }
//            if(carry!=0){
//                sb.append(carry);
//            }
//            arr[i]=sb.toString();
//        }
//        long check=1000000000;
//
//        for (int i = 0; i < arr.length; i++) {
//            StringBuilder sb = new StringBuilder(arr[i]);
//            sb=sb.reverse();
//            arr[i]= sb.toString();
//        }
//        System.out.println(Arrays.toString(arr));
//        String res="";
//        StringBuilder sb1 = new StringBuilder(res);
//        int c=0;
//        for (int i = 0; i < arr[arr.length-1].length(); i++) {
//            int sum=0;
//
//            for (int j = 0; j < arr.length; j++) {
//                if(i<=arr[j].length()){
//
//                }
//            }
//        }
//    }


    public static void main(String[] args) {
        String num1 ="6978451664545";
        String num2 = "45487424542";
//        long a = Integer.parseInt(num1);
//        long b = Integer.parseInt(num2);
//        long res = a*b;
//        String hello = String.valueOf(res);
//        System.out.println(hello);
        BigInteger b = new BigInteger(num1);
        BigInteger c = new BigInteger(num2);
        BigInteger res = b.multiply(c);
        System.out.println(res);
        System.out.println();
    }

}
