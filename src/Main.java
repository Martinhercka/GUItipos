

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args) {


        JFrame jframe = new JFrame("App");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(250, 290);
        jframe.setContentPane(new Tipos().getPanel());
        jframe.setVisible(true);
        
        
    }
}
