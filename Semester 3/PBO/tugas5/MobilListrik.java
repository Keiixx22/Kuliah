public class MobilListrik extends Mobil {
    int baterai = 50;

    MobilListrik() {
        super();
    }

    @Override 
    public void jalan() {
        System.out.println("Berjalan tidak berisik");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Sisa Baterai: " + baterai);
    }
}
