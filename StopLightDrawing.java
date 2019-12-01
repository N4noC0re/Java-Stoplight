//Nathan Priest

import javax.swing.*;
import java.awt.*;

public class StopLightDrawing extends JComponent {

    Color go = Color.gray;
    Color slow = Color.gray;
    Color stop = Color.red;

    String currentLight = "red";

    public void paintComponent(Graphics g){

        g.setColor(Color.yellow);
        g.fillRect(0,0,150,250);

        g.setColor(Color.black);
        g.drawRect(0,0,150,250);

        g.setColor(stop);
        g.fillOval(50, 30, 50, 50);

        g.setColor(slow);
        g.fillOval(50, 100, 50, 50);

        g.setColor(go);
        g.fillOval(50, 170, 50, 50);

    }

    public void changeColor(){
        go = Color.gray;
        slow = Color.gray;
        stop = Color.gray;

        if(currentLight.equals("red")){
            currentLight = "green";
            go = Color.green;
        } else if(currentLight.equals("green")){
            currentLight = "yellow";
            slow = Color.orange;
        } else {
            currentLight = "red";
            stop = Color.red;
        }

        repaint();
    }
}
