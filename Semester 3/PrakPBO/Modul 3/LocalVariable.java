public class LocalVariable {
            int usia = 0;
    public void hitungUsia() {
        int taunSekarang = 2026;
        int tahunLahir = 1993;
        usia = taunSekarang - tahunLahir;
        System.out.println("Usia saya : " + usia);
    }

    public void beratBadan() {
        int beratLahir = 3;
        int beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan + " kg");
    }

    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();

        obj.hitungUsia();
        obj.beratBadan();
    }
}