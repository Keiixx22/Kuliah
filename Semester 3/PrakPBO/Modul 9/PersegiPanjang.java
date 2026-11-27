public class PersegiPanjang extends MethodAbstrak {
    int panjang = 8;
    int lebar = 5;

    public int luas() {
        return panjang * lebar;
    }

    public int keliling() {
        return 2 * (panjang + lebar);
    }
}