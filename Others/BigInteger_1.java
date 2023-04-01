package Others;

import java.math.BigInteger;

public class BigInteger_1 {
    public static void main(String[] args) {
//        BigInteger b = new BigInteger("27346209830709182346");
//        b.bitCount();
        String s = "9";
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            res=Math.max(res,s.charAt(i)-'0');
//            System.out.println(s.charAt(i)-'0');
            System.out.println(res);
        }
//        System.out.println(b.bitLength());
    }
}
