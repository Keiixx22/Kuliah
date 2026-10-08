package model;

public class Product {

    private final String nama;
    private final double harga;
    private int stock;

    public Product(String nama, double harga, int stock) {
        this.nama = nama;

        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif, diset ke 0");
            this.harga = 0;
        } else {
            this.harga = harga;
        }

        if (stock < 0) {
            System.out.println("Stok tidak boleh negatif, diset ke 0");
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    void reduceStock(int qty) {
        stock -= qty;
    }
}