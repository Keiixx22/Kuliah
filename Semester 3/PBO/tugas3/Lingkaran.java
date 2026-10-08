public class Lingkaran {
    double jariJari;

    double hitungLuas() {
        double luas = 3.14 * jariJari * jariJari;
        System.out.println(luas);
        return luas;
    }

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(5);
        Lingkaran lingkaran2 = new Lingkaran(10);
        Lingkaran lingkaran3 = new Lingkaran(15);

        lingkaran1.hitungLuas();
        lingkaran2.hitungLuas();
        lingkaran3.hitungLuas();
    }
}
