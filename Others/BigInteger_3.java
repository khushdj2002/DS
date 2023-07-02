package Others;

import java.math.BigInteger;

public class BigInteger_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        BigInteger b = new BigInteger("23");
        System.out.println(b);
        BigInteger b1 = new BigInteger("-1");
        b=b.multiply(b1);
        System.out.println(b);
        if(b.compareTo(new BigInteger("0"))==1){
            System.out.println("true");
        }
        int a=10;
        String c = String.valueOf(a);
    }
}
