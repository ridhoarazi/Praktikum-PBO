package Suhu;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        double c = 30.0;
        double f = 86.0;

        KonversiSuhu k1 = new KonversiSuhu();
        KonversiSuhu2 k2 = new KonversiSuhu2();

        System.out.println(c + "°C -> Fahrenheit : " + k1.celciusToFahrenheit(c));
        System.out.println(c + "°C -> Reamur     : " + k1.celciusToReamur(c));
        System.out.println(f + "°F -> Reamur     : " + k2.fahrenheitToReamur(f));
    }
}
