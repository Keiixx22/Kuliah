package paket1;

public class SamePackageTest {
    public static void main(String[] args) {
        ProtectedModifier obj = new ProtectedModifier();
        obj.printInfo();      // OK
        obj.sendMessage();    // OK
    }
}