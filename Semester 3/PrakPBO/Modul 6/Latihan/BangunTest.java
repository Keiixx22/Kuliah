package Latihan;

public class BangunTest {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        SegitigaSamaKaki smk = new SegitigaSamaKaki();
        SegitigaSamaSisi sms = new SegitigaSamaSisi();


        persegi.sisi = 5;
        persegi.hitungLuas();
        persegi.hitungKeliling();
        System.out.println("===Persegi===");
        persegi.info();
        
        pp.panjang = 50;
        pp.lebar = 20;
        pp.hitungKeliling();
        pp.hitungLuas();
        System.out.println("\n===Persegi Panjang===");
        pp.info();

        smk.alas = 5;
        smk.tinggi = 10;
        smk.sisiMiring = 7;
        smk.hitungLuas();
        smk.hitungKeliling();
        System.out.println("\n===Sama Kaki===");
        smk.info();

        sms.alas = 7;
        sms.tinggi = 9;
        sms.sisi = 10;
        sms.hitungLuas();
        sms.hitungKeliling();
        System.out.println("\n===Sama Sisi===");
        sms.info();
    }
}
