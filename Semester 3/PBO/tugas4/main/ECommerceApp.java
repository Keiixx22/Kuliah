package main;

import model.Product;
import model.Customer;

public class ECommerceApp {

    private static void cetakStatus(Product p, Customer c) {
        System.out.println("Stok  : " + p.getStock());
        System.out.printf("Saldo : %.0f%n", c.getSaldo());
        System.out.println();
    }

    public static void main(String[] args) {
        Product hp = new Product("Iphone 18 promek", 20000000, 10);
        Customer orang = new Customer(1, "Pandu", 50000000);

        System.out.println("=== Kondisi Awal ===");
        cetakStatus(hp, orang);

        System.out.println("=== Skenario 1: Pembelian Berhasil ===");
        orang.buyProduct(hp, 2);
        cetakStatus(hp, orang);

        System.out.println("=== Skenario 2: Gagal karena Stok Kurang ===");
        orang.buyProduct(hp, 10);
        cetakStatus(hp, orang);

        System.out.println("=== Skenario 3: Gagal karena Saldo Kurang ===");
        orang.buyProduct(hp, 1);
        cetakStatus(hp, orang);
    }
}