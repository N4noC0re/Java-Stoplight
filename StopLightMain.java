//Nathan Priest

import javax.swing.*;
public class StopLightMain {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new StopLightPanel();

        frame.add(panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);






    }
}
