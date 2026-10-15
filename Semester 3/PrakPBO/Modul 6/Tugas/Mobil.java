package Tugas;

public class Mobil extends Kendaraan {
    int jumlahPintu = 4;
    String bahanBakar = "Bensin";

    // public Mobil(String merk, String warna, int kecepatanMaks) {
    //     this.merk = merk;
    //     this.warna = warna;
    //     this.kecepatanMaks = kecepatanMaks;
    // }

    String merk = "Toyota";
    String warna = "Merah";
    int kecepatanMaks = 180;

    public void infoMobil() {
        System.out.println(
            "Merk Mobil : " + merk +
            "\nWarna Mobil : " + warna +
            "\nKecepatan Maksimal Mobil : " + kecepatanMaks +
            "\nJumlah Pintu Mobil : " + jumlahPintu +
            "\nBahan bakar : " + bahanBakar
        );
    }
}
