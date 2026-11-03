public class Product {
    String nama;
    private double price;

    public void setHarga(double price) {
        if (price < 1000) {
            System.out.println("Harga tidak boleh kurang dari 1000");
            this.price = 1000;
        } else {
            this.price = price;
        }
    }

    public double getHarga() {
        return price;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Harga : " + price + "\nNama: " + nama);
    }
}