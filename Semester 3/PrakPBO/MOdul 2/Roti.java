public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;

    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }

    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }

    void beriHarga(double hargaRoti) {
        harga = hargaRoti;
    }

    void infoRoti() {
        System.out.println(
                "Warna Roti : " + warna + "\n" +
                        "Rasa Roti : " + rasa + "\n" +
                        "Berat Roti : " + berat + " gr" + "\n" +
                        "Harga Roti : Rp. " + harga);
    }

    public static void main(String[] args) {
        Roti roti = new Roti();
        Roti roti2 = new Roti();
        Roti roti3 = new Roti();


        roti.beriWarna("Cokelat");
        roti.beriRasa("Manis");
        roti.timbangBerat(200);
        roti.beriHarga(15000);
        roti.infoRoti();

        roti2.beriWarna("Putih");
        roti2.beriRasa("Pahit");
        roti2.timbangBerat(220);
        roti2.beriHarga(19000);
        roti2.infoRoti();

        roti3.beriWarna("Kuning");
        roti3.beriRasa("asam");
        roti3.timbangBerat(300);
        roti3.beriHarga(20000);
        roti3.infoRoti();
    }
}