import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {

    int id;
    int yVelocity;
    int speed = 5;


    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(-speed);
                }
                if (e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(speed);
                }
                break;
            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    setYDirection(-speed);
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    setYDirection(speed);
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W){
                    setYDirection(0);
                }
                if (e.getKeyCode()==KeyEvent.VK_S){
                    setYDirection(0);
                }
                break;
            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    setYDirection(0);
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    setYDirection(0);
                }
                break;
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void move() {
        y = y + yVelocity;
        System.out.println(y);
    }
    public void draw(Graphics g) {
        if(id == 1) {
            g.setColor(new Color(251, 111, 146));
        } else {
            g.setColor(new Color(251, 111, 146));
        }
    g.fillRect(x, y, width, height);


    }
}

