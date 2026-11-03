public class Rpg extends Game {
    private String genre;

    // public Rpg(String judul, int harga, String genre) {
    //     super(judul, harga);
    //     this.genre = genre;
    // }


    public void setGenre(String genre) {
        this.genre = genre; //rpg
    }

    public String getGenre() {
        return genre; // = rpg
    }

    // @Override
    // public void info() {
    //     super.info();
    //     System.out.println("Genre : " + genre); //genre = rpg
    // }
}
