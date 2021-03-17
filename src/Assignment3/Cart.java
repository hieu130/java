package Assignment3;

import java.util.ArrayList;

public class Cart {
    int id;
    String customer;
    double grandTotal;
    String city;
    ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addProduct(Product sp){
        if(sp.checkQty()){
            productList.add(sp);
            sp.setQty(sp.getQty()-1);
            setGrandTotal(getGrandTotal()+sp.getPrice());
        }

    }

    public void removeProduct(int index){
        Product sp = productList.get(index);
        productList.remove(index);
        sp.setQty(sp.getQty()+1);
        setGrandTotal(getGrandTotal()- sp.getPrice());
    }

    public double calculateGrandTotal(){
        if(getCity() == "HN" || getCity() == "HCM"){
            return grandTotal+ grandTotal*1/100;
        }
        return grandTotal+ grandTotal*2/100;
    }
}
