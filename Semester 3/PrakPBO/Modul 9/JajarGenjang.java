public class JajarGenjang extends MethodAbstrak {
    int alas = 6;
    int tinggi = 4;
    int sisiMiring = 5;

    public int luas() {
        return alas * tinggi;
    }

    public int keliling() {
        return 2 * (alas + sisiMiring);
    }
}