public class Buku {
    String judul;
    String penulis;
    private static int jumlahBuku = 0;

    Buku(String judulString, String penulisString) {
        Buku.jumlahBuku++;
        this.judul = judulString;
        this.penulis = penulisString;
    }

    static int getJumlahBuku(){
        return jumlahBuku;
    }

    public static void main(String[] args) {
        Buku novel = new Buku("Anone", "Pandu");
        Buku comic = new Buku("Mie Ayam", "Sang");
        Buku manga = new Buku("Mie Ayam", "Sang");

        System.out.println("Jumlah Buku : " + Buku.getJumlahBuku());
    }
}
