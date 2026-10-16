public class KendaraanMain {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        MobilListrik ml = new MobilListrik();

        System.out.println("\n===Info Mobil===");
        mobil.info();
        System.out.println("\n===Info Motor===");
        motor.info();
        System.out.println("\n===Mobil Listrik===");
        ml.info();
    }
}
