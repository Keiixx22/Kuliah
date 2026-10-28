public class Marksman extends Role {
    private int atkSpeed = 30;

    public Marksman(String nama, int level, int hp, int atkSpeed) {
        super(nama, level, hp);
        setAtkSpeed(atkSpeed);
    }

    public void setAtkSpeed(int atkSpeed) {
        if (atkSpeed < 30) {
            System.out.println("Attack Speed tidak bisa lebih kecil dari 30");
        } else {
            this.atkSpeed = atkSpeed;
        }
    }

    public int getSpeed() {
        return atkSpeed;
    }

    @Override
    public void serang() {
        System.out.println("Marksman menyerang dengan attack speed sebesar : " + atkSpeed);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Attack speed : " + atkSpeed);
    }
}
