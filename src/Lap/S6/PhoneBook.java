package Lap.S6;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phonelist;

    public PhoneBook(){
        phonelist = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p:phonelist){

        }
    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String oldphone, String newphone) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void searchPhone(String name) {

    }
}
