package bangunruang;

import models.Balok;
import models.Kubus;
import interfaces.BangunRuang;

public class BangunRuangMain {
    public static void main(String[] args) {
        BangunRuang balok = new Balok(5, 3, 2);
        System.out.println("Balok:");
        System.out.println("Volume = " + balok.hitungVolume());
        System.out.println("Luas Permukaan = " + balok.hitungLuasPermukaan());

        BangunRuang kubus = new Kubus(4);
        System.out.println("\nKubus:");
        System.out.println("Volume = " + kubus.hitungVolume());
        System.out.println("Luas Permukaan = " + kubus.hitungLuasPermukaan());
    }
}
