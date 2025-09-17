package Matematika;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika m = new Matematika(20, 6);
        Matematika2 m2 = new Matematika2(20, 6);

        System.out.println("Tambah : " + m.tambah());
        System.out.println("Kurang : " + m.kurang());
        System.out.println("Kali   : " + m.kali());
        System.out.println("Bagi   : " + m.bagi());
        System.out.println("Modulus: " + m2.modulus());
    }
}
