public class Role {
    // konstanta batas HP (static final: milik class, tidak bisa diubah)
    public static final int HP_MIN = 0;
    public static final int HP_MAX = 100;

    // penghitung jumlah karakter (static: dipakai bersama oleh semua objek)
    private static int jumlahKarakter = 0;

    // atribut private (encapsulation), hanya bisa diakses lewat getter/setter
    private final int id; // final: diisi sekali di constructor, tanpa setter
    private String nama;
    private int level;
    private int hp;

    public Role(String nama, int level, int hp) {
        jumlahKarakter++;        // naikkan dulu
        this.id = jumlahKarakter; // baru jadi id: 1, 2, 3
        this.nama = nama;
        this.level = level;
        setHealthPoint(hp); // lewat setter supaya validasi ikut jalan
    }

    public static int getJumlahKarakter() {
        return jumlahKarakter;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    // validasi: HP harus di antara HP_MIN dan HP_MAX, kalau tidak nilai ditolak
    public void setHealthPoint(int hp) {
        if (hp < HP_MIN || hp > HP_MAX) {
            System.out.println("Error: HP tidak valid. HP harus antara " + HP_MIN + " - " + HP_MAX);
        } else {
            this.hp = hp;
        }
    }

    public void serang() {
        System.out.println("Player telah menyerang dengan damage");
    }

    public void info() {
        System.out.println("ID : " + id + "\nNama Karakter : " + nama + "\nLevel : " + level + "\nHP : " + hp);
    }
}