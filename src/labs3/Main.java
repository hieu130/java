package labs3;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        r.setName("Phong so 1");
        r.setPosition("Tang 2");
        r.addUser("Phan Van A");
        r.addUser("Nguyen Thi B");
        r.addUser("Tran Van C");
        r.removeUser(2);
        for(String s: r.users){
            System.out.println(s);
        }
    }
}
