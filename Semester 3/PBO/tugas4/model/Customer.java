package model;

public class Customer {
    private final int id;
    private final String nama;
    private double saldo;

    public Customer(int id, String nama, double saldo) {
        this.id = id;
        this.nama = nama;
        if (saldo < 0) {
            System.out.println("Saldo anda tidak boleh negatif, diset 0");
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean buyProduct(Product product, int qty) {
        if (qty <= 0) {
            System.out.println("Jumlah harus lebih dari 0");
            return false;
        } else if (product.getStock() < qty) {
            System.out.println("Stock tidak mencukupi");
            return false;
        }
        double total = product.getHarga() * qty;
        if (saldo < total) {
            System.out.println("Saldo anda tidak cukup");
            return false;
        } else {
            System.out.println("Transaksi anda berhasil");
            saldo -= total;
            product.reduceStock(qty);
            return true;
        }
    }
}