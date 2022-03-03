import java.applet.*;
import java.awt.*;

/*
<APPLET code = "Program7" height="500" width="500"></APPLET>
*/

public class Program7 extends Applet{
    @Override
    public void init() {
        setForeground(Color.RED);
        setBackground(Color.PINK);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(40, 50, 350, 350);
        g.setColor(Color.YELLOW);

        g.fillOval(100, 150, 80, 80);
        g.setColor(Color.YELLOW);

        g.fillOval(250, 150, 80, 80);
        g.setColor(Color.CYAN);

        g.fillArc(130, 260, 180, 70, 180, 180);
    }
}
