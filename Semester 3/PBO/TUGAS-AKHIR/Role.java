public class Role {
    private String nama;
    private int level;
    private int hp;

    public Role(String nama, int level, int hp) {
        this.nama = nama;
        this.level = level;
        setHealthPoint(hp);
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


    public void setHealthPoint(int hp) {
        if (hp < 0 || hp > 100) {
            System.out.println("Error: hp tidak valid. Hp harus antara 0 - 100");
        } else {
            this.hp = hp;
        }
    }

    public void serang() {
        System.out.println("Player telah menyerang dengan damage");
    }

    public void info() {
        System.out.println("Nama Karakter : " + nama + "\nLevel : " + level + "\nHP : " + hp);
    }
}
