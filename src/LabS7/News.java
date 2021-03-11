package LabS7;

import java.util.ArrayList;

public class News implements INews {
    int ID;
    String Title;
    String  PublishDate;
    String Author;
    String Content;
    float AverageRate;
    ArrayList<Integer> rateList;
    public News(){
        rateList = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }
    public void Display(){
        System.out.println("Tieu de: " + getTitle());
        System.out.println("Ngay xuat ban: " + getPublishDate());
        System.out.println("Tac gia: " + getAuthor());
        System.out.println("Noi dung: " + getContent());
        System.out.println("Trung binh: " + getAverageRate());
    }
    public void calulate(){
        float a = 0;
        for (Integer x : rateList){
            a+=x;
        }
        this.AverageRate = a/(rateList.size());
    }
}
