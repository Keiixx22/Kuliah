class EBook extends Koleksi {
    private double ukuranMB;

    public EBook(String judul, int tahunTerbit, double ukuranMB) {
        super(judul, tahunTerbit);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public void info() {
        super.info();
        IO.println("Jenis: E-Book | Ukuran: " + ukuranMB + " MB (Hanya bisa dibaca di tempat)");
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return 0;
    }
}
