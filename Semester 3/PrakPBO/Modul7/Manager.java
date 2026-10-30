public class Manager extends Karyawan {
    private float jamKerja = 7.5f;

    public float getJamKerja() {
        return jamKerja;
    }

    public void setJamkerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }


    public float getGajiManager() {
        return getGaji() * 2;
    }
}