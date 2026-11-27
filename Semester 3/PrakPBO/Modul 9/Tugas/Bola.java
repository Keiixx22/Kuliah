package Tugas;

public class Bola extends BangunRuang {
    double jariJari = 7;

    public double volume() {
        return 4.0 / 3 * PI * jariJari * jariJari * jariJari;
    }

    public double luasSelimut() {
        return 4 * PI * jariJari * jariJari;
    }

    public double luasPermukaan() {
        return 4 * PI * jariJari * jariJari;
    }
}