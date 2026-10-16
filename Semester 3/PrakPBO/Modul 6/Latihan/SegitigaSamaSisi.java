package Latihan;

public class SegitigaSamaSisi extends Segitiga{
    protected double sisi;

    @Override 
    public void hitungLuas() {
        this.luas = 0.5 * alas * tinggi;
    }

    @Override 
    public void hitungKeliling() {
        this.keliling = 3 * sisi;
    }
}
