package TUGAS;

public class CustomerData {
    protected String nama, alamat, tanggalLahir, pekerjaan;
    protected int gaji;

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public CustomerData() {
        this.nama = "Pandu";
        this.alamat = "Gonilan";
        this.tanggalLahir = "22 April 2007";
        this.pekerjaan = "Pengangguran";
        this.gaji = 90000000;
    }

    void panggil() {
        IO.println("\nNama : " + nama + "\nAlamat : " + alamat + "\nTanggal Lahir : " + tanggalLahir + "\nPekerjaan : " + pekerjaan + "\nGaji : " + gaji);
    }
}
