import java.applet.*;
import java.awt.*;

/*
<APPLET code="Program8" height="500" width="500"></APPLET>
*/

public class Program8 extends Applet {
    @Override
    public void init() {
        setBackground(Color.PINK);
        setForeground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.yellow);

        g.drawString("VTCBCSR", 130, 130);
    }
}
