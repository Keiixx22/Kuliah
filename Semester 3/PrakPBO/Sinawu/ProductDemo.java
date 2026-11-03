public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        Product product2 = new Product();

        product.setNama("Mie ayam");
        product.setHarga(5000);
        product.info();

        product2.setHarga(900);
    }
}
