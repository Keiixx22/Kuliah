package Tugas;

public class Pesawat extends Kendaraan {
    int kapasitas = 180;
    int ketinggianMaks = 12000;

    // public Pesawat(String merk, String warna, int kecepatanMaks) {
    //     this.merk = merk;
    //     this.warna = warna;
    //     this.kecepatanMaks = kecepatanMaks;
    // }

    String merk = "Lion Air";
    String warna = "Kuning";
    int kecepatanMaks = 900;

    public void infoPesawat() {
        System.out.println(
            "Merk Pesawat : " + merk +
            "\nWarna Pesawat : " + warna +
            "\nKecepatan Maksimal Pesawat : " + kecepatanMaks +
            "\nKapasitas Pesawat : " + kapasitas + " Orang" +
            "\nKetinggian Maksimal : " + ketinggianMaks
        );
    }
}
