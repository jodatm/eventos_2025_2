import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App3 extends JFrame implements MouseListener,
KeyListener{

    Container contenedor;
    int x1=-1;
    int x2 =-1;
    int y1 =-1;
    int y2 =-1;

    public void paint(Graphics g){
        /*g.drawLine(250, 150, 500, 0);
        g.drawRect(50, 50, 250, 100);
        g.setColor(new Color(178,15,15));
        g.fillRect(50, 150, 50, 50);
        g.setColor(new Color(11,13,200));
        g.drawOval(400, 50, 60, 60);
        g.fillOval(400, 150, 60, 60);*/
        //g.drawLine(x1, y1, x2, y2);
        if(x2>x1&&y2>y1){
            g.drawRect(x1, y1, x2-x1, y2-y1);
        }
        if(x2>x1&&y2<y1){
            g.drawRect(x1, y2, x2-x1, y1-y2);
        }
        if(x2<x1&&y2<y1){
            g.drawRect(x2, y2, x1-x2, y1-y2);
        }
        if(x2<x1&&y2>y1){
            g.drawRect(x2, y1, x1-x2, y2-y1);
        }
        
        x1=-1;
        y1=-1;
        x2=-1;
        y2=-1;
    }

    public App3(){
        contenedor = getContentPane();
        addMouseListener(this);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        App3 app = new App3();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(contenedor, e.getX() + ","+ e.getY());
        if(x1==-1 && y1 == -1){
            System.out.println();
            x1 = e.getX();
            y1 = e.getY();

        }else{
            System.out.println("2");
            x2 = e.getX();
            y2 = e.getY();
            repaint();
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //contenedor.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //contenedor.setBackground(Color.YELLOW);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println(e.getExtendedKeyCode());
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
