/*
Write an applet program which accepts number of ovals user wants to display using parameter tag and draws ovals in different positions.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET code="Program10" height="500" width="500"> </APPLET>*/

public class Program10 extends Applet implements ActionListener {
    TextField t1, t2;
    Button b1;
    String s = "";

    @Override
    public void init() {
        t1 = new TextField();
        add(t1);

        b1 = new Button();
        add(b1);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        s = ae.getActionCommand();

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int x = 0, n = 0;

        g.drawString("Enter number of circles to draw: ", 10, 10);

        x = Integer.parseInt(t1.getText());

        for(int i = 0; i <= x; i++) {
            g.drawOval(20 + n, 20 + n, 100, 100);
            
            n += 50;
        }
    }
}
