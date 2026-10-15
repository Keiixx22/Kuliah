package Tugas;

public class Kendaraan {
    String merk = "Garuda Owo";
    String warna = "Putih";
    int kecepatanMaks = 100;


    public void info() {
        System.out.println(
            "Merk : " + merk +
            "\nWarna : " + warna + 
            "\nKecepatan Maksimal : " + kecepatanMaks
        );
    }
}
