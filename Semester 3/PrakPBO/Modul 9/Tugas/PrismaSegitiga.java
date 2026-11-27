package Tugas;

public class PrismaSegitiga extends BangunRuang {
    // alas berupa segitiga siku-siku 3-4-5
    double alasSegitiga = 3;
    double tinggiSegitiga = 4;
    double sisiMiringSegitiga = 5;
    double tinggiPrisma = 10;

    double luasAlas() {
        return alasSegitiga * tinggiSegitiga / 2;
    }

    double kelilingAlas() {
        return alasSegitiga + tinggiSegitiga + sisiMiringSegitiga;
    }

    public double volume() {
        return luasAlas() * tinggiPrisma;
    }

    public double luasSelimut() {
        return kelilingAlas() * tinggiPrisma;
    }

    public double luasPermukaan() {
        return 2 * luasAlas() + luasSelimut();
    }
}