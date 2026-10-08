public class Rekening {
    private double saldo;
    private String noRekening;
    private String nama;

    public Rekening(String noRekening, String nama, double saldoAwal) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.saldo = saldoAwal;
    }

    public double cekSaldo() {
        System.out.println("Saldo " + nama + " (" + noRekening + "): Rp" + saldo);
        return saldo;
    }

    public void menabung(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah menabung tidak valid!");
            return;
        }
        saldo += jumlah;
        System.out.println(nama + " menabung Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void menarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
            return;
        }
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk menarik Rp" + jumlah);
            return;
        }
        saldo -= jumlah;
        System.out.println(nama + " menarik Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void transfer(Rekening tujuan, double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Transfer gagal, saldo tidak cukup!");
            return;
        }
        this.menarik(jumlah);
        tujuan.menabung(jumlah);
        System.out.println("Transfer Rp" + jumlah + " dari " + this.nama + " ke " + tujuan.nama + " berhasil.");
    }
}