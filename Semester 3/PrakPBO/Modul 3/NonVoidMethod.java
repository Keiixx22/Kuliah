public class NonVoidMethod {
    String nama = "Habibur";
    String nim = "L200250022";

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod mahasiswa = new NonVoidMethod();

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNIM());
    }
}