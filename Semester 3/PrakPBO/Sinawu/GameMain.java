public class GameMain {
    public static void main(String[] args) {
        Rpg rpg1 = new Rpg();

        rpg1.setJudul("Bagoes Petualangan");
        rpg1.setHarga(9000);
        rpg1.setGenre("RPG");

        System.out.println("Judul : " + rpg1.getJudul());
        System.out.println("Harga : " + rpg1.getHarga());
        System.out.println("Genre : " + rpg1.getGenre());
    }
}
