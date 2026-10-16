package Latihan;

public class Persegi extends BangunDatar{
    protected double sisi;

    @Override
    public void hitungLuas() {
        this.luas = sisi * sisi;
    }


    @Override
    public void hitungKeliling() {
        this.keliling = 4 * sisi;
    }
}
