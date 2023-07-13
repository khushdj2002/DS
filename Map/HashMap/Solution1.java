//package Map.HashMap;
//
//import java.util.HashMap;
//
//public class Solution1 {
//    public static void main(String[] args) {
//        String a="MCMXCIV";
//
//
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//        int res=map.get(a.charAt(a.length()-1));
//        for (int i = 1; i<a.length() ; i++) {
//            if(map.get(a.charAt(a.length()-i))>map.get(a.charAt(a.length()-i-1))){
//                res=res-map.get(a.charAt(a.length()-i-1));
//            }
//            else{
//                res=res+map.get(a.charAt(a.length()-i-1));
//            }
//        }
//        System.out.println(res);
//    }
//}
