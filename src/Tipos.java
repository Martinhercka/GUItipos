import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tipos extends Main
{
    private JPanel panel;
    private JTextField loginfield;
    private JPasswordField passwordfield;
    private JButton loginbutton;
    private JLabel error;

    public Tipos()
    {

        error.setVisible(false);
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                String login=loginfield.getText();
                String password=passwordfield.getText();

                if(login.length()<2 || password.length()<2)
                {
                    error.setVisible(true);
                }
                else
                    {
                    error.setVisible(false);






                        JFrame jframe2 = new JFrame("Logged");
                        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        jframe2.setSize(250, 290);
                        jframe2.setContentPane(new LoggedForm().getPanel2());
                        jframe2.setVisible(true);


                }






            }


        });
    }

    public JPanel getPanel()
    {

        return panel;
    }


}
