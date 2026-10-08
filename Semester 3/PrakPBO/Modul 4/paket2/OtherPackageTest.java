package paket2;

import paket1.ProtectedModifier;

public class OtherPackageTest {
    public static void main(String[] args) {
        ProtectedModifier obj = new ProtectedModifier();
        obj.printInfo();      // ERROR: printInfo() has protected access
        obj.sendMessage();    // ERROR
    }
}