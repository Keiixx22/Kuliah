package Latihan;

public class Kucing1 extends Pet {
    
    @Override
    public void makanan() {
        IO.println("Menyukai Ikan");
    }

    @Override
    public String perilaku() {
        return "Meeoow Meeoow";
    }
}
