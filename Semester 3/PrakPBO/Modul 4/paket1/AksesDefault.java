package paket1;

class AksesDefault {
    public static void main(String[] args) {
        DefaultModifier dm = new DefaultModifier();

        System.out.println(dm.a);   // akses variabel
        System.out.println(dm.b);
        dm.jumlah();                // akses method
    }
}