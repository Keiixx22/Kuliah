public class Pegawai {
    String nama;
    int nip;
    double gaji;

    public void setDataPegawai(String inputNama, int inputNip, double inputGaji) {
        this.nama = inputNama;
        this.nip = inputNip;
        this.gaji = inputGaji;

        System.out.println("Nama : " + this.nama);
        System.out.println("NIP  : " + this.nip);
        System.out.println("Gaji : Rp " + this.gaji);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setDataPegawai("Budi Santoso", 10101, 5000000.0);

        Pegawai pegawai2 = new Pegawai();
        pegawai2.setDataPegawai("Siti Aminah", 10102, 5500000.0);

        Pegawai pegawai3 = new Pegawai();
        pegawai3.setDataPegawai("Andi Wijaya", 10103, 6000000.0);

        Pegawai pegawai4 = new Pegawai();
        pegawai4.setDataPegawai("Dewi Lestari", 10104, 4500000.0);

        Pegawai pegawai5 = new Pegawai();
        pegawai5.setDataPegawai("Rudi Hartono", 10105, 7000000.0);
    }
}