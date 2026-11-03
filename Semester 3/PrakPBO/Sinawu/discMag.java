public class discMag extends Magazine {
    String customer;

    public discMag(String title, String author, double price, int Qty, String cust) {
        super(title, author, price, Qty);
        customer = cust;
    }

    @Override
    public void invMag(int disc) {
        super.invMag(disc);
        System.out.println("Check disc before you go");
    }
}
