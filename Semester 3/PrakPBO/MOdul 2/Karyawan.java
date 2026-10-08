public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    void beriNama(String namaKaryawan) {
        nama = namaKaryawan;
    }

    void beriAlamat(String alamatKaryawan) {
        alamat = alamatKaryawan;
    }

    void beriJabatan(String jabatanKaryawan) {
        jabatan = jabatanKaryawan;
    }

    void beriGaji(double gajiKaryawan) {
        gaji = gajiKaryawan;
    }

    void tampilkanNama() {
        System.out.println(
            "Nama Dosen: " + nama
        );
    }

    void tampilkanJabatan() {
        System.out.println(
            "Jabatan : " + jabatan
        );
    }

    void tampilkanAlamat() {
        System.out.println(
            "Alamat : " + alamat
        );
    }

    void tampilkanGaji() {
        System.out.println(
            "Gaji Karyawan : Rp. " + gaji
        );
    }

    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        karyawan.beriNama("Yusuf");
        karyawan.beriAlamat("Pajang");
        karyawan.beriGaji(2000000);
        karyawan.beriJabatan("Pejabat");
        karyawan.tampilkanAlamat();
        karyawan.tampilkanGaji();
        karyawan.tampilkanJabatan();
        karyawan.tampilkanNama();
    }
}
