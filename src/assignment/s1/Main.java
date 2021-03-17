package assignment.s1;
import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            // nhap 3 so tu ban phim
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap canh 1");
            double a = sc.nextDouble();
            System.out.println("Nhap canh 2");
            double b = sc.nextDouble();
            System.out.println("Nhap canh 3");
            double c = sc.nextDouble();

            TamGiac tg = new TamGiac();
            tg.setCanh1(a);
            tg.setCanh2(b);
            tg.setCanh3(c);
            System.out.println("Chu vi: "+tg.chuVi());
            System.out.println("Dien tich: "+tg.dienTich());
        }
    }
