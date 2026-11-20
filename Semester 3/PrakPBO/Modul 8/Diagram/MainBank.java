package Diagram;

public class MainBank {
    public static void main(String[] args) {
        Bank b1 = new BankPribadi();
        Bank b2 = new BankUmum();
        Bank b3 = new BankPasar();
        Bank b4 = new BankSyariah();

        IO.println("Bank Pribadi: " + b1.rasioBunga() + "%");
        IO.println("Bank Umum: " + b2.rasioBunga() + "%");
        IO.println("Bank Pasar: " + b3.rasioBunga() + "%");
        IO.println("Bank Syariah: " + b4.rasioBunga() + "%");
    }
}