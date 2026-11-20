package Latihan;

    public class Anjing extends Pet {

    @Override
    public void makanan() {
        IO.println("Menyukai Daging dan Tulang");
    }

    public String perilaku() {
        return "Guk Guk Guk";
    }
}
