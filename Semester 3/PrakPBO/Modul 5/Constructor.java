public class Constructor {
    String nama;
    String nim;
    String alamat;

    public Constructor() {
        this.nama = "Pandu";
        this.nim = "L200250025";
        this.alamat = "Gunungkidul";
    }

    void displayDetails() {
        System.out.println("Nama saya : " + nama + "\n" + 
        "NIM : " + nim + "\n" +
        "Alamat saya : " + alamat);
    }
}