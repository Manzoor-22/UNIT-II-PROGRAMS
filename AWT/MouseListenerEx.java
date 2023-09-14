package AWT;

import java.awt.*;
import java.awt.event.*;

class MS extends Frame implements MouseListener{
    Label l;
    MS(){
        super("Mouse Event Handling");
        setLayout(null);
        l = new Label();
        l.setBounds(20,20,100,100);
        add(l);
        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Exited");
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse Pressed");
    }
}

public class MouseListenerEx{
    public static void main(String[] args) {
        MS obj = new MS();
        obj.setSize(500,500);
        obj.setVisible(true);
    }
}