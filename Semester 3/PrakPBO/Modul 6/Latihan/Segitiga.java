package Latihan;

public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    @Override 
    public void hitungLuas() {
        this.luas = 0.5 * alas * tinggi;
    }

    @Override 
    public void hitungKeliling() {

    }
}
