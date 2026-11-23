public class Perpustakaan {
    void main() {
        Buku buku = new Buku("Pemrograman java", 2026);
        EBook ebook = new EBook("PBO", 2026, 500);

        Koleksi[] dafter = {buku, ebook};
        for (Koleksi k : dafter) {
            k.info();
            IO.println("Denda 3 hari: Rp" + k.hitungDenda(3));
            IO.println("---");
        }
        buku.pinjam();
        buku.info();
        buku.kembalikan();
    }
}