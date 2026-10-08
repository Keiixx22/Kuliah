public class Hitung {
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Hitung hitung1 = new Hitung();

        System.out.println(
            "Hasil : " + hitung1.tambah(5, 3)
        );
        
        System.out.println(
            "Hasil : " + hitung1.tambah(5.5, 3.2)
        );

        System.out.println(
            "Hasil : " + hitung1.tambah(5, 3.2)
        );
    }
}
