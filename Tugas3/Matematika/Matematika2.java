package Matematika;

public class Matematika2 extends Matematika {
    public Matematika2() {}
    public Matematika2(int a, int b) {
        super(a, b); // memanggil constructor parent
    }

    public int modulus() {
        return getA() % getB();
    }
}
