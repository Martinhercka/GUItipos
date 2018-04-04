import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LoggedForm
{
    private int[] arr;

    private JPanel panel2;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;

    public LoggedForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arr = new int[5];
                Random random=new Random();
                arr[0]=random.nextInt(35)+1;
                int i,j=1,k;
                boolean match;
                do{
                    arr[j]=random.nextInt(35)+1;
                    match=false;
                    for(k=0;k<j;k++){
                        if(arr[j]==arr[k]){
                            match=true;
                        }
                    }
                    if(match==false){
                        j++;
                    }
                }while(j!=5);

                for(i=0;i<4;i++)
                    for(j=0;j<4;j++)
                        if(arr[j]>arr[j+1]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }



                label1.setText(Integer.toString(arr[0]));
                label2.setText(Integer.toString(arr[1]));
                label3.setText(Integer.toString(arr[2]));
                label4.setText(Integer.toString(arr[3]));
                label5.setText(Integer.toString(arr[4]));

            }
        });
    }

    public JPanel getPanel2()
    {
        return panel2;
    }
}
