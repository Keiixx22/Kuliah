public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;

    public Buku(String judulBuku, String namaPengarang, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    public void info() {
        System.out.println("Judul: " + judulBuku + "\nPengarang: " + namaPengarang +
        "\nTerbit: " + tahunTerbit + "\nCetakan ke: " + cetakanKe + "\nHarga: " + hargaJual + "\n-----------------" );
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku("1 Porsi Mie Ayam", "Budi Santoso", 2005, 3, 85000);
        Buku buku2 = new Buku("Gorengan Nusantara", "Siti Rahayu", 2012, 1, 120000);
        Buku buku3 = new Buku("Resep Sambal Pedas", "Agus Wijaya", 2018, 4, 65000);
        Buku buku4 = new Buku("Kopi Pagi Hari", "Dewi Lestari", 2020, 2, 95000);
        Buku buku5 = new Buku("Belajar Java Dasar", "Rina Kartika", 2019, 6, 150000);
        Buku buku6 = new Buku("Sejarah Batik Solo", "Hendra Pratama", 2001, 8, 110000);
        Buku buku7 = new Buku("Petualangan di Jawa", "Maya Anggraini", 2015, 2, 78000);
        Buku buku8 = new Buku("Matematika Seru", "Joko Susilo", 2022, 1, 135000);
        Buku buku9 = new Buku("Kisah Si Kancil", "Lestari Putri", 1998, 10, 45000);
        Buku buku10 = new Buku("Dasar Pemrograman", "Andi Firmansyah", 2023, 3, 175000);

        // Buku[] daftarBuku = {buku1, buku2, buku3, buku4, buku5, buku6, buku7, buku8, buku9, buku10};

        // for (Buku b : daftarBuku) {
        //     b.info();
        // }

        buku1.info();
        buku2.info();
        buku3.info();
        buku4.info();
        buku5.info();
        buku6.info();
        buku7.info();
        buku8.info();
        buku9.info();
        buku10.info();
        
    }
}