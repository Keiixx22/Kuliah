public class ParameterizedCons {
    String nama, nim;
    int semester;

    public ParameterizedCons(String nama, int semester, String nim) {
        this.nama = nama;
        this.semester = semester;
        this.nim = nim;
    }

    public void info() {
        System.out.println("Nama : " + nama + "\nNim : " + nim + "\nSemester : " + semester);
    }
}
