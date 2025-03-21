import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;

public class Runner extends JComponent implements KeyListener, MouseListener, MouseMotionListener {
    //instance variables
    private int WIDTH;
    private int HEIGHT;

    //Default Constructor
    public Runner() {
        WIDTH = 1000;
        HEIGHT = 500;

    }

    //This method will acknowledge user input
    public void keyPressed(KeyEvent e) {

    }
    public void paintComponent(Graphics g) {

    }

    public void loop() {

        repaint();
    }

    //These methods are required by the compiler.
    //You might write code in these methods depending on your goal.
    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void start(final int ticks) {
        Thread gameThread = new Thread() {
            public void run() {
                while (true) {
                    loop();
                    //60 ticks per second
                    try {
                        Thread.sleep(1000 / ticks);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        gameThread.start();
    }

    public static void main(String[] args) {
        Runner g = new Runner();
        g.start(60);
    }


    //generate force vectors based on center of mass to mouse click and then calculate the vectors --> set the vectors to variables in object then calculate stuff

    //call gravity every second to modify the acceleration vectors y component
    //call friction every second to modify the acceleration vectors x component --> when on ground

    //every frame apply the velocity vectors


}
