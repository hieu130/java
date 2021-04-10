package Demo.s9;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DemoDateTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Hom Nay:"+ld);
        System.out.println("Hom Nay:"+ld.plusDays(1));
        System.out.println("Hôm qua:"+ ld.minusDays(1));
        System.out.println("Ngày này năm sau:"+ld.plusYears(1));
        System.out.println("Ngày này tuần sau:"+ld.plusWeeks(1));
        System.out.println("Hom Nay là ngày thứ:"+ld.getDayOfYear()+"của năm");
        System.out.println("Tháng"+ld.getMonth());
        System.out.println("tháng:"+ld.getMonthValue());
        System.out.println("Thứ:"+ld.getDayOfYear());
//        LocalDate ld2 = LocalDate.parse("2002-03-16");
//        int ngay = ld2.getDayOfMonth();
//        int thang = ld2.getMonthValue();
//        if(ngay == ld.getDayOfMonth() && thang == ld.getMonthValue()){
//            System.out.println("Happy Birthday!");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao nam muon kiem tra");
//        int y = sc.nextInt();
//        LocalDate nn = LocalDate.of(y,12,31);
//        if (nn.getDayOfYear() ==366){
//            System.out.println("Day la nam nhuan");
//        }else {
//            System.out.println("Day khong phai nam nhuan");
//        }
//        LocalDate nn2 = LocalDate.of(y,2,28);
//        if (nn2.plusDays(1).getDayOfMonth() ==29){
//            System.out.println("Day la nam nhuan");
//        }else {
//            System.out.println("Day khon phai nam nhuan");
//        }
        LocalDateTime t = LocalDateTime.now();
        System.out.println("Ngay luc nay: " +t);
        System.out.println("Ngay mai vao luc nay: " +t.plusDays(1));
        System.out.println("Mot tieng nua: " +t.plusHours(1));
        System.out.println("Mot luc nua: " +t.plusMinutes(15));
        System.out.println("Mot teo nua: " +t.plusSeconds(20));
        System.out.println("Xiu nua: " +t.plusNanos(50));
        }
    }

