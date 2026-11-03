public class ProductDemo {
    public static void main(String[] args) {
        Product bagoes = new Product();
        Product product2 = new Product();

        bagoes.setNama("Mie ayam");
        bagoes.setHarga(5000);
        bagoes.setHarga("");
        bagoes.info();

        product2.setHarga(900);
        System.out.println(Product.umur);
    }
}
