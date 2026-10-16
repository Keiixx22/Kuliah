package Latihan;

public class SegitigaSamaKaki extends Segitiga{
    protected double sisiMiring;

    @Override
    public void hitungLuas() {
        this.luas = 0.5 * alas * tinggi;
    }

    @Override 
    public void hitungKeliling() {
        this.keliling = 2 * sisiMiring;
    }
}
