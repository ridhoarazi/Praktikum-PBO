package Matematika;

public class Matematika {
    private int a;
    private int b;

    public Matematika() {}
    public Matematika(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public int getB() { return b; }
    public void setB(int b) { this.b = b; }

    public int tambah() { return a + b; }
    public int kurang() { return a - b; }
    public int kali()   { return a * b; }
    public int bagi()   { return a / b; }
}
