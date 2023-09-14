package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    int ans = 0;
    Label l1;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;
    MyFrame(){
        super("Calculator");
        setLayout(new FlowLayout());
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        l1 = new Label("Answer = " + ans);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l1);
    }
    public void actionPerformed(ActionEvent e){
        ans = 0;
        l1.setString("coutn");
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        MyFrame obj = new MyFrame();
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}
