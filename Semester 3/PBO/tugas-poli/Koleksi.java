abstract class Koleksi {
    protected String judul;
    protected int tahunTerbit;

    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void info() {
        IO.println("Judul : " + judul + " Tahun Terbit : " + tahunTerbit);
    }

    public abstract double hitungDenda(int hariTerlambat);
}
