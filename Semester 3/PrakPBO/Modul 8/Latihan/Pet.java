package Latihan;

public class Pet {
    private String nama;

    public void beriNama(String nama) {
        this.nama = nama;
    }

    public String panggilNama() {
        return this.nama;
    }

    public void makanan() {
        IO.println("Apa aja");
    }

    public String perilaku() {
        return "Hewan Penurut";
    }
}
