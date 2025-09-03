package nilai;

public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    void Nilai(String nim, String nama, double absen, double tugas, double uts, double uas, double akhir) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = absen;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiAkhir = akhir;
    }

    void CetakNilai() {
        System.out.println("NIM                : " + nim);
        System.out.println("Nama               : " + nama);
        System.out.println("Nilai Absen [10%]  : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]  : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]  : " + nilaiUTS);
        System.out.println("Nilai UAS [40%]  : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}

