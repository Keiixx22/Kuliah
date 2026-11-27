public class MethodMain {
    void main() {
        MethodAbstrak[] bangun = {
            new Persegi(), new PersegiPanjang(), new JajarGenjang(), new Lingkaran(), new Segitiga()
        };

        for (MethodAbstrak b : bangun) {
            IO.println(b.getClass().getSimpleName() + " : Luas: " + b.getLuas() + ", Keliling: " + b.getKel());
        }
    }
}
