package models;

import interfaces.BangunRuang;

public class Kubus implements BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
