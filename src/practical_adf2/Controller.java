package practical_adf2;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField txtID;
    public TextField txtName;
    public TextField txtPhone;
    public TextField txtAddress;
    public TextField txtDate;
    public TextField txtReturn;
    public TextArea txtKetqua;

    public static ArrayList<String> ds = new ArrayList<>();

    public void add() {
        String i = txtID.getText();
        String n = txtName.getText();
        String p = txtPhone.getText();
        String a = txtAddress.getText();
        String d = txtDate.getText();
        String r = txtReturn.getText();
        if (!i.isEmpty() || !n.isEmpty() || !p.isEmpty() || !a.isEmpty()|| !d.isEmpty()|| !r.isEmpty()) {
            ds.add(i + "__" + n + "__" + p +"__" + a +"__" + d +"__" + r +"\n");
            String txt = "";
            for (String s : ds) {
                txt += s;
            }
            txtKetqua.setText(txt);
            txtID.setText("");
            txtName.setText("");
            txtPhone.setText("");
            txtAddress.setText("");
            txtDate.setText("");
            txtReturn.setText("");
        }

    }
    public void edit(){

    }
    public void display(){

    }
    public void exit(){

    }


}
