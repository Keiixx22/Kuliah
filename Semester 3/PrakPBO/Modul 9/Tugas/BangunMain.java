package Tugas;

public class BangunMain {
    void main() {
        BangunRuang[] bangun = {
            new Balok(), new Kubus(), new Bola(), new Kerucut(), new PrismaSegitiga()
        };
        for (BangunRuang b : bangun) {
            System.out.printf("%s : Volume: %.2f, Luas Selimut: %.2f, Luas Permukaan: %.2f%n",
                b.getClass().getSimpleName(),
                b.getVolume(),
                b.getLuasSelimut(),
                b.getLuasPermukaan());
        }
    }
}
