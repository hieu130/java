package labs2_2;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.setTuSo(1);
        f1.setMauSo(2);
        Fraction f2 = new Fraction();
        f2.setTuSo(1);
        f2.setMauSo(3);
        Fraction t = f1.add(f2);
        t.inPhanSo();
    }
}
