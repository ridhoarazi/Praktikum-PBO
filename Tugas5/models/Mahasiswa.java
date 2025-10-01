package models;

public class Mahasiswa {
    private String npm;
    private String nama;
    private double kehadiran;
    private double tugas;
    private double uts;
    private double uas;

    public Mahasiswa(String npm, String nama, double kehadiran, double tugas, double uts, double uas) {
        this.npm = npm;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (0.10 * kehadiran) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    public char getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 76) return 'A';
        else if (nilaiAkhir >= 66) return 'B';
        else if (nilaiAkhir >= 56) return 'C';
        else if (nilaiAkhir >= 46) return 'D';
        else return 'E';
    }

    public String getKeterangan() {
        switch (getGrade()) {
            case 'A': return "ISTIMEWA";
            case 'B': return "BAIK";
            case 'C': return "CUKUP";
            case 'D': return "KURANG";
            default:  return "KURANG SEKALI";
        }
    }

    public void tampilkanData() {
        System.out.println("\n=== HASIL NILAI MAHASISWA ===");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Akhir   : " + hitungNilaiAkhir());
        System.out.println("Grade         : " + getGrade());
        System.out.println("Keterangan    : " + getKeterangan());
    }
}
