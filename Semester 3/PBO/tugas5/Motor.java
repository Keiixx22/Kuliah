public class Motor extends Kendaraan {
    String jenisMesin = "Disel";

    Motor() {
        super("Honda", 120);
    }

    @Override 
    public void jalan() {
        System.out.println("Berjalan dengan roda 2");
    }

    @Override 
    public void info() {
        super.info();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
