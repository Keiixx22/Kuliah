package Tugas;

public class Kerucut extends BangunRuang {
    double jariJari = 3;
    double tinggi = 4;
    double garisPelukis = 5;

    public double volume() {
        return 1.0 / 3 * PI * jariJari * jariJari * tinggi;
    }

    public double luasSelimut() {
        return PI * jariJari * garisPelukis;
    }

    public double luasPermukaan() {
        return PI * jariJari * (jariJari + garisPelukis);
    }
}