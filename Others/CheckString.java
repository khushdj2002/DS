package Others;

public class CheckString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        if (a==b){
            System.out.println("hello");
        }
        int x=127;
        int y=127;
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}