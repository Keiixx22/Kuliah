public class Kucing {
    String nama;
    int umurs;
    String warna;

    void beriNama(String namaBulu) {
        nama = namaBulu;
    }

    void beriWarna(String warnaKucing) {
        warna = warnaKucing;
    }

    void meong() {
        System.out.println(
                "Meong Meong Meong");
    }

    void beriUmur(int umurKucing) {
        umurs = umurKucing;
    }

    void umur() {
        System.out.println(
                "Umur Kucing : " + umurs + " bulan");
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();

        kucing1.meong();
        kucing1.beriWarna("Hitam");
        kucing1.beriUmur(11);
        kucing1.umur();
    }
}
