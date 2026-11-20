package Latihan;

public class TestPolymorphism {
    void main() {
        Pet kucing = new Kucing1();
        Pet anjing = new Anjing();
        Elang elang = new Elang();

        kucing.beriNama("TOM");
        IO.println(kucing.panggilNama());
        kucing.makanan();
        IO.println(kucing.perilaku());
        IO.println();
        anjing.beriNama("BULL");
        IO.println(anjing.panggilNama());
        anjing.makanan();
        IO.println(anjing.perilaku());
        IO.println();
        elang.beriNama("Garuda");
        IO.println(elang.panggilNama());
        elang.jalan();
    }
}
