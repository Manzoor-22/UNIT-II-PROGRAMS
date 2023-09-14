package AWT;

import java.awt.*;    
import java.awt.event.*;    

class MyFrame2 extends Frame implements KeyListener{
    Label l;
    TextField t;
    MyFrame2(){
        super("Keyboard Event Handling");
        setLayout(null);
        l = new Label();
        l.setBounds(20,20,100,50);
        t = new TextField("");
        t.setBounds(150,150,200,200);
        t.addKeyListener(this);
        add(t);
        add(l);
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


public class KeyListenerExample{    
    public static void main(String[] args) {
        MyFrame2 obj = new MyFrame2();
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}   