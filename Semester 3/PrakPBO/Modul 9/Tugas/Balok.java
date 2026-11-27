package Tugas;

public class Balok extends BangunRuang {
    double panjang = 8;
    double lebar = 5;
    double tinggi = 4;

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasSelimut() {
        return 2 * tinggi * (panjang + lebar);
    }

    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}