public class Mahasiswa {
    String nama;
    static String universitas = "UMS";

    void beriNama(String nama) {
        this.nama = nama;
    }

    void ubahUniversitas(String universitasString) {
        universitas = universitasString;
    }
    void tampilData() {
        System.out.println(
            "nama saya : " + nama + "\n" +
            "saya berasal dari : " + universitas + "\n"
        );
    }
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();

        mahasiswa1.beriNama("Pandu");
        mahasiswa1.ubahUniversitas("UNS");
        mahasiswa1.tampilData();

        mahasiswa2.beriNama("Ega");
        mahasiswa2.tampilData();

        mahasiswa3.beriNama("Arep");
        mahasiswa3.tampilData();
    }
}

// Variabel universitas dideklarasikan static, sehingga menjadi milik class Mahasiswa, bukan milik objek. Hanya ada satu salinan variabel ini, dan semua objek (mahasiswa1, mahasiswa2, mahasiswa3) mengaksesnya. Saat mahasiswa1.ubahUniversitas("UNS") dipanggil, yang diubah adalah variabel milik class itu, sehingga objek lain ikut melihat nilai "UNS". Jadi perubahan tidak "menyebar" ke objek lain, melainkan memang tidak pernah ada salinan terpisah.