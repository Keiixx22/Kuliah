public class MethodParameter {

    String nama;

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public static void main(String[] args) {

        MethodParameter mp = new MethodParameter();

        mp.setNama("Rian");

        System.out.println(mp.nama);
    }
}