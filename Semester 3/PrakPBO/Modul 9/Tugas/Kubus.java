package Tugas;

public class Kubus extends BangunRuang {
    double sisi = 5;

    public double volume() {
        return sisi * sisi * sisi;
    }

    public double luasSelimut() {
        return 4 * sisi * sisi;
    }

    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}