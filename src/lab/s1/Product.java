package lab.s1;

public class Product {
    String code;
    String name;
    double price;
    int qty;
    String unit;

    void upQty(int a) {
        qty += a;
    }

    void downQty(int a) {
        if (qty > a) {
            qty -= a;
            return;
        }
        System.out.println("khong the giam");

    }

    void changeQty(int a) {
        if (a > 0) {
            qty += a;
            return;
        }
        qty = qty + a > 0 ? qty + a : 0;
    }
    void changePrice(int a){
        price = price+a>0?price+a:0;
    }

    boolean checkProduct(){
        if(qty>0) return true;
        return false;
    }

    void printProduct(){
        System.out.println("ma: "+code);
        System.out.println("ten: "+name);
        System.out.println("gia: "+price);
        System.out.println("Sl: "+qty);
    }
}
