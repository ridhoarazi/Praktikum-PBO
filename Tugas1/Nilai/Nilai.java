package nilai;

public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;

    void Nilai(String nim, String nama, double absen, double tugas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = absen;
        this.nilaiTugas = tugas;
    }

    void CetakNilai() {
        System.out.println("NIM                : " + nim);
        System.out.println("Nama               : " + nama);
        System.out.println("Nilai Absen [10%]  : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]  : " + nilaiTugas);
    }
}

