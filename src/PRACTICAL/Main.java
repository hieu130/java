package PRACTICAL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Scanner nhap = new Scanner(System.in);
        System.out.println("yeu cau nguoi dung nhap ten vao:");
        c.name = nhap.nextLine();
        System.out.println("ten: "+c.getName());
        System.out.println("van toc toi da:"+c.moveMax());

        Motor m = new Motor();
        System.out.println("yeu cau nguoi dung nhap vao:");
        m.name = nhap.nextLine();
        System.out.println("ten:"+m.getName());
        System.out.println("van toc toi da:"+m.moveMax());
    }
}

