public class Kendaraan {
    String merk;
    int kecepatanMaks;

    public Kendaraan(String merk, int kecepatanMaks) {
        this.merk = merk;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void info() {
        System.out.println(
            "Merk: " + merk +
            "\nKecepatan Maksimal: " + kecepatanMaks
        );
    }

    public void jalan() {
        System.out.println("Kendaraan ini jalan");
    }
}