public class Magazine {
    String title;
    String author;
    double price;
    int Qty;

    public Magazine(String title, String author, double price, int Qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.Qty = Qty;
    }

    public void invMag(int disc) {
        System.out.println("Your disc = " + disc + "%" + "\nRp. " + price);
    }
}
