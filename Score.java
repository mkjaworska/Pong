import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(251, 111, 146));
        g.setFont(new Font("Serif", Font.BOLD, 40));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2) - 65, 50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2) + 20, 50);
    }
}
