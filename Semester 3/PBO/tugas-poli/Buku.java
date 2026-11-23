interface Peminjaman {
    void pinjam();
    void kembalikan();
}
class Buku extends Koleksi implements Peminjaman {
    private boolean dipinjam = false;

    public Buku(String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
    }

    @Override
    public void info() {
        super.info();
        IO.println("Jenis: Buku | Status : " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 1000;
    }

    @Override
    public void pinjam() {
        dipinjam = true;
        IO.println("Buku " + judul + "\nBerhasil dipinjam.");
    }

    @Override
    public void kembalikan() {
        dipinjam = false;
        IO.println("Buku " + judul + "\nTelah dikembalikan.");
    }
}
