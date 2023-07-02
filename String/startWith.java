package String;

public class startWith {
    public static void main(String[] args) {
        String s ="Greeks for goods";
        String d = "Gr";
        if (s.startsWith(d)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println(s.substring(0,3));
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.charAt(0);
    }
}