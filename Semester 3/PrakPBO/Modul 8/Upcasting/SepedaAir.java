package Upcasting;

public class SepedaAir extends Sepeda {
    void run() {
        IO.println("Hanya bisa berjalan diatas air");
    }

    void main() {
        Sepeda s = new SepedaAir();

        s.run();
    }
}
