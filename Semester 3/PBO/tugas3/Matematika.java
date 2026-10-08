public class Matematika {
    static int tambah(int a, int b) {
        return a + b;
    }

    int kali(int a, int b) {
        return a * b;
    }



    public static void main(String[] args) {
        Matematika matematika1 = new Matematika();
        // kali(2, 3);

        System.out.println(
                "Hasil Pertambahan adalah : " + Matematika.tambah(10, 10));

        System.out.println(
                "Hasil Perkalian adalah : " + matematika1.kali(20, 10));
    }
}
