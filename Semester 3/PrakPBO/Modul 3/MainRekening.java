public class MainRekening {
    public static void main(String[] args) {
        // Membuat objek rekening 1
        Rekening rek1 = new Rekening();
        rek1.no_rekening = "123456789";
        rek1.nama = "Yusuf";
        rek1.saldo = 500000;

        // Membuat objek rekening 2
        Rekening rek2 = new Rekening();
        rek2.no_rekening = "987654321";
        rek2.nama = "Rini";
        rek2.saldo = 200000;

        // Demonstrasi method
        System.out.println("--- Saldo Awal ---");
        System.out.println("Saldo " + rek1.nama + ": Rp " + rek1.cek_saldo());
        System.out.println("Saldo " + rek2.nama + ": Rp " + rek2.cek_saldo());
        System.out.println();

        // Andi menabung
        rek1.menabung(100000);
        System.out.println();

        // Budi menarik uang
        rek2.menarik(50000);
        System.out.println();

        // Andi transfer ke Budi
        rek1.transfer(rek2, 150000);
        System.out.println();

        // Cek saldo akhir
        System.out.println("--- Saldo Akhir ---");
        System.out.println("Saldo " + rek1.nama + ": Rp " + rek1.cek_saldo());
        System.out.println("Saldo " + rek2.nama + ": Rp " + rek2.cek_saldo());
    }
}