package AppletViewer;
import java.awt.*;
import java.applet.*;

@Deprecated
public class Appletex extends Applet{
    public void paint(Graphics G){
        G.drawString("Hello World", 20, 20);
    }
}

/*
    <applet code = "Appletex" height = "500" width = "500"></applet>
 */
