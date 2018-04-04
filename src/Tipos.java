import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Tipos
{
    private JPanel panel;
    private JTextField loginfield;
    private JPasswordField passwordfield;
    private JButton loginbutton;
    private JLabel error;




        public JFrame firstFrame( ) {
            JFrame jframe = new JFrame("App");
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setSize(500, 500);
            jframe.setContentPane(panel);
            jframe.setVisible(true);

            return jframe;
        }

    public  Tipos()
    {
        JFrame loginFrame = firstFrame();

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
                        loginFrame.dispose();
                    }


            }


        });
    }





}
