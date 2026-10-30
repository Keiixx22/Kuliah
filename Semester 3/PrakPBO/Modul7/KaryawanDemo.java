public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan kl = new Karyawan();
        Manager manager1 = new Manager();
        Manager manager2= new Manager();
        Manager manager3 = new Manager();
        Manager manager4 = new Manager();
        Manager manager5 = new Manager();


        kl.setNama("Pandu");
        kl.setGaji(500000);
        kl.setUsia(20);


        manager1.setGaji(800000);
        manager1.setNama("Andra");
        manager1.setUsia(22);
        manager1.setJamkerja(8.5f);

        manager2.setGaji(500000);
        manager2.setNama("Pandoe");
        manager2.setUsia(35);
        manager2.setJamkerja(8.5f);

        manager3.setGaji(500000);
        manager3.setNama("Yusuf");
        manager3.setUsia(45);
        manager3.setJamkerja(9.5f);

        manager4.setGaji(500000);
        manager4.setNama("Anu");
        manager4.setUsia(17);
        manager4.setJamkerja(6.5f);

        manager5.setGaji(500000);
        manager5.setNama("eeee");
        manager5.setUsia(90);
        manager5.setJamkerja(10.5f);

        System.out.println("=== Karyawan ===");
        System.out.println(kl.getNama());
        System.out.println(kl.getGaji());
        System.out.println(kl.getUsia());

        System.out.println("=== manager ===");
        System.out.println(manager1.getNama());
        System.out.println(manager1.getGajiManager());
        System.out.println(manager1.getUsia());
        System.out.println(manager1.getJamKerja());

        System.out.println();

        System.out.println(manager2.getNama());
        System.out.println(manager2.getGajiManager());
        System.out.println(manager2.getUsia());
        System.out.println(manager2.getJamKerja());

        System.out.println();

        System.out.println(manager3.getNama());
        System.out.println(manager3.getGajiManager());
        System.out.println(manager3.getUsia());
        System.out.println(manager3.getJamKerja());

        System.out.println();

        System.out.println(manager4.getNama());
        System.out.println(manager4.getGajiManager());
        System.out.println(manager4.getUsia());
        System.out.println(manager4.getJamKerja());

        System.out.println();

        System.out.println(manager5.getNama());
        System.out.println(manager5.getGajiManager());
        System.out.println(manager5.getUsia());
        System.out.println(manager5.getJamKerja());
    }
}
