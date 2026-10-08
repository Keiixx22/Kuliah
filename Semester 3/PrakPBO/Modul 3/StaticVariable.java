public class StaticVariable {
    public static char akreditasi;
    public static final String Jurusan = "Teknik Informatika";
    
    void firstMethod() {
        System.out.println(Jurusan);
    }
    void secondMethod() {
        System.out.println("Akreditasi : " + akreditasi);
    }
}

