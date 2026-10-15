package Tugas;

public class KendaraanTest {
    public static void main(String[] args) {
        // Mobil mobil = new Mobil("Toyota", "Merah", 180);
        // Pesawat pesawat = new Pesawat("Lion Air", "Kuning", 900);
        Mobil mobil = new Mobil();
        Pesawat pesawat = new Pesawat();

        System.out.println("===Mobil===");
        mobil.info();
        mobil.infoMobil();

        System.out.println("\n===Pesawat===");
        pesawat.info();
        pesawat.infoPesawat();
    }
}
