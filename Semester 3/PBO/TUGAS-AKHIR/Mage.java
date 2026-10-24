public class Mage extends Role {
    private int magicDmg;

    public Mage(String nama, int level, int hp, int magicDmg) {
        super(nama, level, hp);
        setMagic(magicDmg);
    }

    public int getMagic() {
        return magicDmg;
    }

    public void setMagic(int magicDmg) {
        if (magicDmg <= 0) {
            System.out.println("Damage tidak bisa kurang dari 0, damage di set ke 1");
            this.magicDmg = 1;
        } else {
            this.magicDmg = magicDmg;
        }
    }

    @Override 
    public void serang() {
        System.out.println("Mage menyerang dengan magic damage sebesar : " + magicDmg);
    }

    @Override 
    public void info() {
        super.info();
        System.out.println("Magic damage : " + magicDmg);
    }
}
