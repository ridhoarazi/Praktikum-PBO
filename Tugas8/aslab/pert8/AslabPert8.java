/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aslab.pert8;

import java.util.Scanner;
import models.Book;

/**
 *
 * @author Rafy1
 */
public class AslabPert8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] koleksi = new Book[5];
        koleksi[0] = new Book("Cara Memasak", "Raihan", "1930", false);
        koleksi[1] = new Book("Bumi Manusia", "Pramoedya Ananta Toer", "1980", false);
        koleksi[2] = new Book("Laskar Pelangi", "Andrea Hratai", "2005", false);
        koleksi[3] = new Book("Habis", "Adit", "2005", false);
        koleksi[4] = new Book("Terang", "Rai", "2004", false);
        int pilihan;
        

        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Book");
            System.out.println("2. Cari Book berdasarkan judul");
            System.out.println("3. Pinjam Book");
            System.out.println("4. Kembalikan Book");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Book ---");
                    for(Book b : koleksi){
                        b.tampilkanDataBuku();
                    }
                    System.out.println("\n tekan enter untuk melanjutkan");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;

                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(cari)) {
                            System.out.println("\nBuku ditemukan:");
                            b.tampilkanDataBuku();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Buku dengan judul \"" + cari + "\" tidak ditemukan.");
                    }
		    break;

                case 3:
                    System.out.print("Masukkan judul Book yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
                    
                    // Lakukan logika untuk meminjam buku disini
                    for(Book b : koleksi){
                        if(b.judul.equalsIgnoreCase(pinjam)){
                            if(!(b.isBooked)){
                                b.isBooked = true;
                                System.out.println("Buku " + pinjam + " telah dipinjam");
                                ada = true;   
                            } else {
                                System.out.println("Buku " + pinjam + " Sudah dipinjam");
                            }
                        }
                    }
                    
                    if(!ada){
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;

                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(kembali)) {
                            ditemukanKembali = true;
                            if (b.isBooked) {
                                b.isBooked = false;
                                System.out.println("Buku \"" + kembali + "\" berhasil dikembalikan!");
                            } else {
                                System.out.println("Buku \"" + kembali + "\" belum dipinjam.");
                            }
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        
        input.close();
        
    }
    
}