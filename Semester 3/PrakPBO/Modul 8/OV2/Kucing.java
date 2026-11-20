package OV2;

public class Kucing extends Hewan {
    public void jalan() {
        IO.println("Kucing bisa berjalan dengan dan Berlari");
    }
    void main() {
        Hewan kucing = new Kucing();
        kucing.jalan();
    }
}
