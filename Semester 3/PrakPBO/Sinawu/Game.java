public class Game {
    private String judul;
    private int harga;

    // public Game(String judul, int harga) {
    //     this.judul = judul;
    //     getHarga();
    // }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setHarga(int harga) {
        if (harga <= 0) {
            System.out.println("Harga tidak boleh 0, dibawah 0");
        } else {
            this.harga = harga;
        }
    }

    public int getHarga() {
        return harga;
    }

    // public void info() {
    //     System.out.println("Judul : " + judul + "\nHarga : Rp. " + harga);
    // }
}