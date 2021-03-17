package lab.s1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.code = "001";
        p1.name = "San pham so 1";
        p1.qty = 10;
        p1.price = 20000;
        Product p2 = new Product();
        p2.code = "002";
        p2.name = "San pham so 2";
        p2.qty = 20;
        p2.price = 30000;
        Product p3 = new Product();
        p3.code = "003";
        p3.name = "San pham so 3";
        p3.qty = 30;
        p3.price = 40000;
        p1.printProduct();
        p2.printProduct();
        p3.printProduct();
    }
}
