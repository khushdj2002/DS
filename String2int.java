public class String2int {
    public static void main(String[] args) {
        String a = " - 00300";
        String sub="-";
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            int len=ch;
            if (a.charAt(i) == ' '||a.charAt(i)=='-') {

            } else if ((len>=97&&len<=122)||len>=65&&len<=90) {
                
            } else {
                int b = Integer.parseInt("" + a.charAt(i));
                System.out.println(b);
                res = res * 10 + b;
            }

        }
        if(a.contains(sub)){
            System.out.println("-"+res);
        }
        System.out.println(res);
//        char ch='a';
//        int len=ch;
//        System.out.println(len);

//        System.out.println(length.length);

    }
}
