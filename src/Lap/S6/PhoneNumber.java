package Lap.S6;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> Phone;
    public PhoneNumber(String name, String phone){
        this.name = name;
        this.Phone = new ArrayList<>();
    }
    public void addPhone(String phone){
        this.Phone.add(phone);
    }
    public void removePhone(String phone){
        this.Phone.remove(phone);
    }
}
