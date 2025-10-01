/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

import java.util.Scanner;
import models.Mahasiswa;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM           : ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama          : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran : ");
        double kehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas     : ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS       : ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS       : ");
        double uas = input.nextDouble();

        Mahasiswa mhs = new Mahasiswa(npm, nama, kehadiran, tugas, uts, uas);

        mhs.tampilkanData();

        input.close();
    }
}
