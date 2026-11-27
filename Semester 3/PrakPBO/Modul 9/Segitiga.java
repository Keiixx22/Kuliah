public class Segitiga extends MethodAbstrak {
    int alas = 6;
    int tinggi = 8;
    int sisiMiring = 10;

    public int luas() {
        return alas * tinggi / 2;
    }

    public int keliling() {
        return alas + tinggi + sisiMiring;
    }
}