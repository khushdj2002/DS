package Others;

public class InterfaceImpl implements InterfaceA,InterfaceB,InterfaceC{
    @Override
    public void doSomething() {
        System.out.println("DoSomething implementef in concrete class");
    }

    public static void main(String[] args) {
        InterfaceA objA = new InterfaceImpl();
        InterfaceB objB = new InterfaceImpl();
        InterfaceC objC = new InterfaceImpl();

        objA.doSomething();
        objB.doSomething();
        objC.doSomething();
    }
}
