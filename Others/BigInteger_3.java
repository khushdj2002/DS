package Others;

import java.math.BigInteger;
import java.util.Arrays;

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
        BigInteger[] bi = new BigInteger[10];
        bi[0] = new BigInteger(String.valueOf("0"));
        bi[1] = new BigInteger(String.valueOf("1"));
        for (int i = 2; i < bi.length; i++) {
            bi[i] = new BigInteger(String.valueOf(bi[i-2].add(bi[i-1].multiply(bi[i-1]))));
        }
        Integer xyz = bi[3].intValue();
        System.out.println(Arrays.toString(bi));
    }
}
