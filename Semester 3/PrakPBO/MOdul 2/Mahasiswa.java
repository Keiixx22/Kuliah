public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;

    void beriNama(String namaMahasiswa) {
        nama = namaMahasiswa;
    }

    void beriNim(String nimMahasiswa) {
        nim = nimMahasiswa;
    }

    void beriAlamat(String alamatMahasiswa) {
        alamat = alamatMahasiswa;
    }

    void beriSemester(int semesterMahasiswa) {
        semester = semesterMahasiswa;
    }

    void tampilkanNama() {
        System.out.println(
                "Nama Mahasiswa: " + nama);
    }

    void tampilkanNim() {
        System.out.println(
                "Nim Mahasiswa : " + nim);
    }

    void tampilkanAlamat() {
        System.out.println(
                "Alamat : " + alamat);
    }

    void tampilkanSemester() {
        System.out.println(
                "Semester : " + semester);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.beriNama("Yusuf");
        mahasiswa.beriNim("L200250025");
        mahasiswa.beriAlamat("Pajang");
        mahasiswa.beriSemester(5);
        mahasiswa.tampilkanNama();
        mahasiswa.tampilkanNim();
        mahasiswa.tampilkanAlamat();
        mahasiswa.tampilkanSemester();
    }
}
