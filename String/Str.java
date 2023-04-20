package String;

public class Str {
    public static void main(String[] args) {
        String s = "fkjdbjk";
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.toString().indexOf('f');

    }
}
