package paket1;

class AksesPublic {
    public static void main(String[] args) {
        PublicModifier pm = new PublicModifier();

        System.out.println(pm.a);
        System.out.println(pm.b);
        System.out.println(pm.c);
        pm.kali();
        pm.tambah();
        pm.kurang();
        pm.bagi();
        pm.rata_rata();
    }
}