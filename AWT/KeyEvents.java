package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame implements KeyListener{
    Label l;
    TextArea t;
    MyFrame1(){
        super("Keyboard Event Handling");
        setLayout(new FlowLayout());
        t = new TextArea("Write here",1,20);
        l = new Label("");
        add(l);
        add(t);
        t.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
}

public class KeyEvents {
    public static void main(String[] args) {
        MyFrame1 obj = new MyFrame1();
        obj.setSize(300,300);
        obj.setVisible(true);
    }
}
