package String;

public class ToString {
    int b =15;
    int c =10;
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);//here compiler takes it has a.toString() method
        ToString t1 = new ToString();
        System.out.println(t1);
    }

    @Override
    public String toString() {
        return b+c+"";
    }
}
