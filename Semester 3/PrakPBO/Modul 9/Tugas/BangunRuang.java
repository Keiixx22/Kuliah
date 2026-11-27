package Tugas;

public abstract class BangunRuang {
    public static final double PI = 3.14;

    public abstract double volume();
    public abstract double luasSelimut();
    public abstract double luasPermukaan();

    public double getVolume() {
        return volume();
    }

    public double getLuasSelimut() {
        return luasSelimut();
    }

    public double getLuasPermukaan() {
        return luasPermukaan();
    }
}