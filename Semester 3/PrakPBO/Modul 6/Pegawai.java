public class Pegawai {
    double gajiPokok = 10000000;
    
    public class Programmer extends Pegawai {
        // public static void main(String[] args) {
        //     double lemburPerjam = 50000;
        //     double gajiPerbulan;

        //     Pegawai pegawai = new Pegawai();
        //     gajiPerbulan = pegawai.gajiPokok + lemburPerjam;
        //     System.out.println(gajiPerbulan);
        // }

        double lemburPerjam = 50000;

        double hitungGajiPerbulan() {
            return gajiPokok + lemburPerjam;
        }
    }
    
    public class Teknisi extends Pegawai {
        // public static void main(String[] args) {
        //     double lemburPerjam = 40000;
        //     double gajiPerbulan;
            
        //     Pegawai pegawai = new Pegawai();
        //     gajiPerbulan = pegawai.gajiPokok + lemburPerjam;
        //     System.out.println(gajiPerbulan);
        // }
    }

    double lemburPerjam = 40000;

    double hitungGajiPerbulan() {
        return gajiPokok + lemburPerjam;
    }

    public static void main(String[] args) {
        Programmer programmer = new Pegawai().new Programmer();
        Teknisi teknisi = new Pegawai().new Teknisi();
    
        System.out.printf("Gaji Programmer per bulan: %.0f%n", programmer.hitungGajiPerbulan());
        System.out.printf("Gaji Teknisi per bulan: %.0f%n", teknisi.hitungGajiPerbulan());
    }
}

    
