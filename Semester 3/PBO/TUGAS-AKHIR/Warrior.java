public class Warrior extends Role {
    private int phyDamage;

    public Warrior(String nama, int level, int hp, int phyDamage) {
        super(nama, level, hp);
        setDamage(phyDamage);
    }

    public int getDamage() {
        return phyDamage;
    }

    public void setDamage(int phyDamage) {
        if (phyDamage <= 0) {
            System.out.println("Damage harus lebih dari 0");
            this.phyDamage = 1;
        } else {
            this.phyDamage = phyDamage;
        }
    }

    @Override
    public void serang() {
        System.out.println("Warrior menyerang physical damage sebesar " + phyDamage);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Attack : " + phyDamage);
    }
}
