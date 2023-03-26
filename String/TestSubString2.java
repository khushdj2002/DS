import java.util.Arrays;

public class TestSubString2 {
    public static void main(String[] args) {
        String text = new String("Hello My name is Kushal");
        String [] sentence = text.split("a");
        System.out.println(Arrays.toString(sentence));
        System.out.println(sentence.length);
    }
}
