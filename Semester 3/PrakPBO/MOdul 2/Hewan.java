public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String tipe;

    void beriNama(String namaHewan) {
        nama = namaHewan;
    }
    
    void beriKaki(int kakiHewan) {
        kaki = kakiHewan;
    }

    void beriMakan(String makananHewan) {
        makanan = makananHewan;
    }

    void beriTipe(String tipeHewan) {
        tipe = tipeHewan;
    }

    void infoHewan() {
        System.out.println(
            "Nama Hewan : " + nama + "\n" +
            "Jumlah Kaki : " + kaki + "\n" +
            "Makanan : " + makanan + "\n" +
            "Tipe Hewan" + tipe + "\n"
        );
    }

    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.beriNama("Harimau");
        hewan1.beriKaki(4);
        hewan1.beriMakan("Daging");
        hewan1.beriTipe("Karnivora");
        hewan1.infoHewan();

        hewan2.beriNama("Kerbau");
        hewan2.beriKaki(4);
        hewan2.beriMakan("Rumput");
        hewan2.beriTipe("Karnivora");
        hewan1.infoHewan();
    }
}
