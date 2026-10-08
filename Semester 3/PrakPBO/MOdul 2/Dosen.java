public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahirDate;

    void beriNama(String namaDosen) {
        nama = namaDosen;
    }

    void beriNik(int nikDosen) {
        nik = nikDosen;
    }

    void beriPendidikan(String pendidikanDosen) {
        pendidikan = pendidikanDosen;
    }

    void beriTanggal(String tglLahir) {
        tglLahirDate = tglLahir;
    }

    void tampilkanNama() {
        System.out.println(
            "Nama Dosen: " + nama
        );
    }

    void tampilkanTglLahir() {
        System.out.println(
            "Tanggal Lahir : " + tglLahirDate
        );
    }

    void tampilkanNik() {
        System.out.println(
            "NIK dosen : " + nik
        );
    }

    public static void main(String[] args) {
        Dosen dosen = new Dosen();

        dosen.beriNama("Yusuf");
        dosen.beriNik(200250007);
        dosen.beriPendidikan("Informatika");
        dosen.beriTanggal("2000-04-22");
        dosen.tampilkanNama();
        dosen.tampilkanNik();
        dosen.tampilkanTglLahir();
    }
}
