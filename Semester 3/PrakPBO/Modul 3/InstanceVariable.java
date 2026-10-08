public class InstanceVariable {
    int usia = 20;
    int berat = 80;
    int beratLahir = 5;
    int tahunLahir = 1993;
    int tahunSekarang = 2026;

    void hitungBerat() {
        berat = beratLahir + (usia / 2);
        System.out.println("Berat badan: " + berat);
    }

    void hitungUsia() {
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia : " + usia);
    }

    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable();

        iv.hitungBerat();
        iv.hitungUsia();
    }
}