public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Pandu", 40, 100, 200);
        Mage mage1 = new Mage("Roxy", 55, 90, 200);
        Marksman marksman1 = new Marksman("Sylphy", 45, 60, 70);

        System.out.println("Tangguh Pandu Prabowo \nL200250025");

        System.out.println("\n\n=== Warrior ===");
        warrior1.setDamage(150);
        warrior1.setHealthPoint(95);
        warrior1.info();
        warrior1.serang();

        System.out.println("\n=== Mage ===");
        mage1.setMagic(200);
        mage1.setHealthPoint(70);
        mage1.info();
        mage1.serang();

        System.out.println("\n=== Marksman ===");
        marksman1.setAtkSpeed(55);
        marksman1.setHealthPoint(70);
        marksman1.info();
        marksman1.serang();
    }
}
