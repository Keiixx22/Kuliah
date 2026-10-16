public class Mobil extends Kendaraan {
    int jumlahPintu = 4;

    Mobil() {
        super("Toyota", 180);
    }

    @Override 
    public void jalan() {
        System.out.println("Berjalan dengan roda 4");
    }

    @Override 
    public void info() {
        super.info();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
