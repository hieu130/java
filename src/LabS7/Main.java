package LabS7;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        n.setTitle("Tin tuc nhanh");
        n.setID(1);
        n.setAuthor("Khong ro ten");
        n.setContent("Khong co noi dung bai bao");
        n.setPublishDate("11/03/2020");
        n.rateList.add(3);
        n.rateList.add(4);
        n.rateList.add(5);
        n.calulate();
        n.Display();
    }
}
