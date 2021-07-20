import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest {
    private JPanel mainPanel;
    private JButton showTextButton;
    private JTextField textField1;
    public GuiTest(){

    /*
        mainPanel=new JPanel();
        showTextButton=new JButton();
        textField1=new JTextField();

        mainPanel.add(showTextButton);
        mainPanel.add(textField1);

*/

        showTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==showTextButton){
                    for(int i=0;i<=3;i++){
                    textField1.setText("The button was pressed!");

                    System.out.println("the value of i is:"+i);



                if(e.getSource()==showTextButton&&i==2){
                    textField1.setText("The button was pressed twice!");
                }}
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("GuiTest");
        frame.setContentPane(new GuiTest().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
