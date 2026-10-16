package Latihan;

public class PersegiPanjang  extends BangunDatar{
    protected int panjang;
    protected double lebar;

    @Override
    public void hitungLuas() {
        this.luas = panjang * lebar;
    }

    @Override 
    public void hitungKeliling() {
        this.keliling = 2 * (panjang + lebar);
    }

}
