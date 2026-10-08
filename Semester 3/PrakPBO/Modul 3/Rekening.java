public class Rekening {
    String no_rekening;
    String nama;
    double saldo;

    public double cek_saldo() {
        return saldo;
    }

    public void menabung(double jumlah) {
        saldo = saldo + jumlah;
        System.out.println(nama + " menabung: Rp " + jumlah);
    }

    public void menarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo = saldo - jumlah;
            System.out.println(nama + " menarik: Rp " + jumlah);
        } else {
            System.out.println("Maaf, saldo " + nama + " tidak mencukupi untuk penarikan Rp " + jumlah);
        }
    }

    public void transfer(Rekening tujuan, double jumlah) {
        if (jumlah <= saldo) {
            this.saldo = this.saldo - jumlah; 
            tujuan.saldo = tujuan.saldo + jumlah; 
            System.out.println(nama + " transfer Rp " + jumlah + " ke " + tujuan.nama);
        } else {
            System.out.println("Maaf, saldo " + nama + " tidak mencukupi untuk transfer Rp " + jumlah);
        }
    }
}