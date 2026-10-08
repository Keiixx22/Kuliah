public class StaticVariableAccess {
    public static void main (String[] args) {
        StaticVariable.akreditasi = 'A';
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
    }
}