package AWT;

import java.awt.*;

public class First {
    public static void main(String[] args){
        Frame f = new Frame("My First Program!");
        f.setLayout(new FlowLayout());
        Label l = new Label("Label");
        Button b = new Button("Click Me!");
        TextField tf = new TextField("Hello world!");
        f.add(l);
        f.add(b);
        f.add(tf); 
        f.setSize(500,500);
        f.setVisible(true);
    }
}
