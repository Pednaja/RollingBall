package Lib;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class RollingBall extends JPanel implements ActionListener{
    int x = 0;
    int s = getWidth();
    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawOval(s/2, 90, 80, 80);
        g.fillArc(s/2, 90, 80, 80, x, 180);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       x-=5;
    if (s<=400) {
        s+=10;  
    }else
    s=-50;

    repaint();
    }
}

