package TUGAS;

public class Tugas {
    void main() {
        CustomerData cd = new CustomerData();
        CustomerData cd1 = new CustomerData("Bayu", "Sana", "12 April 2000", "Software Engineer", 90009090);
        CustomerData cd2 = new CustomerData("Siti Rahmawati", "Jl. Slamet Riyadi No. 45, Surakarta", "3 Februari 1998", "Guru SMA", 5200000);
        CustomerData cd3 = new CustomerData("Andi Prasetyo", "Jl. Malioboro No. 12, Yogyakarta", "21 Agustus 1995", "Akuntan", 8500000);
        CustomerData cd4 = new CustomerData("Dewi Lestari", "Jl. Diponegoro No. 7, Semarang", "15 Juli 1999", "Dokter Umum", 15000000);
        CustomerData cd5 = new CustomerData("Rizky Maulana", "Jl. Ahmad Yani No. 88, Bandung", "9 November 1993", "Arsitek", 12000000);
        CustomerData cd6 = new CustomerData("Putri Anggraini", "Jl. Gajah Mada No. 21, Jakarta", "28 Mei 2001", "Desainer Grafis", 6800000);
        CustomerData cd7 = new CustomerData("Hendra Wijaya", "Jl. Pemuda No. 33, Surabaya", "17 Januari 1990", "Manajer Pemasaran", 18500000);
        CustomerData cd8 = new CustomerData("Lina Marlina", "Jl. Veteran No. 5, Malang", "6 Desember 1997", "Perawat", 4800000);
        CustomerData cd9 = new CustomerData("Fajar Nugroho", "Jl. Kaliurang Km 8, Sleman", "30 Oktober 1996", "Data Analyst", 11000000);
        CustomerData cd0 = new CustomerData("Maya Sari", "Jl. Pahlawan No. 19, Medan", "11 Maret 2002", "Content Creator", 7500000);

        cd.panggil();
        cd1.panggil();
        cd2.panggil();
        cd3.panggil();
        cd4.panggil();
        cd5.panggil();
        cd6.panggil();
        cd7.panggil();
        cd8.panggil();
        cd9.panggil();
        cd0.panggil();
    }
}