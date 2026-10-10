public class DefaultCons {
    int nomor;
    String nama;

    void DefaultAccess() {

    }

    DefaultCons(int nomor, String nama) {
        this.nama = nama;
        this.nomor = nomor;
    }

    void info() {
        System.out.println("Nomor: " + nomor + "\n" +
        "Nama: " + nama);
    }

    public static void main(String[] args) {
        DefaultCons dc = new DefaultCons(2000, "Pandu");

        dc.info();
    }
}
