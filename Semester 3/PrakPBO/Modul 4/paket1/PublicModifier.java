package paket1;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali() {
        int d = a * b * c;
        System.out.println("Hasil kali = " + d);
    }

    // Soal 2: method tambahan
    public void tambah() {
        int hasil = a + b + c;
        System.out.println("Hasil tambah = " + hasil);
    }

    public void kurang() {
        int hasil = a - b - c;
        System.out.println("Hasil kurang = " + hasil);
    }

    public void bagi() {
        double hasil = (double) a / b / c;
        System.out.println("Hasil bagi = " + hasil);
    }

    public void rata_rata() {
        double hasil = (a + b + c) / 3.0;
        System.out.println("Rata-rata = " + hasil);
    }
}