public class Lingkaran extends MethodAbstrak {
    int jariJari = 7;
    double pi = 3.14;

    public int luas() {
        return (int) (pi * jariJari * jariJari);
    }

    public int keliling() {
        return (int) (2 * pi * jariJari);
    }
}