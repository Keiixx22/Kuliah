public class TurunanAbstrak extends AbstrakClass {
    int x;

    public TurunanAbstrak(int a, int b, int c) {
        super(a, b, c);
        x = a + b + c;
    }
    public void printX() {
        IO.println(x);
    }
}
