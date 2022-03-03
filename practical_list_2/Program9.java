import java.applet.*;
import java.awt.*;

/*
<APPLET code="Program9" height="500" width="500"></APPLET>
*/

public class Program9 extends Applet{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.RED);
        g.fillOval(10, 10, 100, 100);
    }
}
