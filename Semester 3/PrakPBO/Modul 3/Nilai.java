public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;

    public double hitungNilaiTotal(int uts, int uas, int tugas) {
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiTugas = tugas;

        double nilaiTotal = (this.nilaiUTS + this.nilaiUAS + this.nilaiTugas) / 3.0;
        
        return nilaiTotal;
    }

    public static void main(String[] args) {
        Nilai objNilai = new Nilai();
        
        double hasil = objNilai.hitungNilaiTotal(80, 90, 85);
        
        System.out.println("Nilai UTS   : " + objNilai.nilaiUTS);
        System.out.println("Nilai UAS   : " + objNilai.nilaiUAS);
        System.out.println("Nilai Tugas : " + objNilai.nilaiTugas);
        System.out.println("Nilai Total : " + hasil);
    }
}