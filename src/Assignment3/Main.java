package Assignment3;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setProductName("Dong ho ");
        p1.setPrice(15000);
        p1.setQty(2);

        Product p2 = new Product();
        p2.setId(2);
        p2.setProductName("vay ");
        p2.setPrice(3000);
        p2.setQty(5);

        Cart c = new Cart();
        c.setId(1);
        c.setCustomer("Nguyen Van An");
        c.setCity("HN");

        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p1);

        System.out.println("Tong tien phai tra: "+c.calculateGrandTotal());
        System.out.println("Ds san pham da mua:");
        for(Product p:c.productList){
            System.out.println(p.getProductName()+"----"+p.getPrice());
        }
    }
}
