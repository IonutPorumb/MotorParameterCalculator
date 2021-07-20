import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextSamplerDemo extends JPanel
                             implements ActionListener {
    private String newLine="\n";
    protected static final String textFieldString="JTextField";
    protected static final String passwordFieldString="JPasswordField";
    protected static final String ftfString="JFormattedTextField";
    protected static final String buttonString="JButton";
    protected JLabel actionLabel;

    public void textSamplerDemo(){
        setLayout(new BorderLayout());
        //Creating a regular text field
        JTextField textField=new JTextField(10);
        textField.setActionCommand(textFieldString);
        textField.addActionListener(this);

//Create a password field
        JPasswordField passwordField=new JPasswordField();
        passwordField.setActionCommand(passwordFieldString);
        passwordField.addActionListener(this);

//Create a formatted text field:
        JFormattedTextField formattedTextField=new JFormattedTextField();
        formattedTextField.setActionCommand(ftfString);
        formattedTextField.addActionListener(this);
//Creating the labels for the fields

        JLabel textFieldLabel=new JLabel(textFieldString+":");
        textFieldLabel.setLabelFor(textField);
        JLabel passwordFieldLabel=new JLabel(passwordFieldString+":");
        passwordFieldLabel.setLabelFor(passwordField);
        JLabel formattedTextFieldLabel=new JLabel(ftfString+":");
        formattedTextFieldLabel.setLabelFor(formattedTextField);

//We create a label to put te message during an action event.

        actionLabel=new JLabel("Type text in a field and press Enter.");
        actionLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

//Lay out the text control and the label.

        JPanel textControlPane= new JPanel();
        GridBagLayout gridBag=new GridBagLayout();
        GridBagConstraints constraints=new GridBagConstraints();
        textControlPane.setLayout(gridBag);
//We create an array of labels of JLabel data type:

        JLabel[] labels={textFieldLabel,passwordFieldLabel, formattedTextFieldLabel};

//we create an array of text fields of JTextField data type:

        JTextField[] textFields={textField,passwordField,formattedTextField};

//Calling the addLabelTextRow method:
        addLabelTextRows(labels,textFields,gridBag,textControlPane);














    }
    /**
     *Creating the Label text rows
     */

    private void addLabelTextRows(JLabel[] label,
                                  JTextField[] textField,
                                  GridBagLayout gridBag,
                                  Container container) {

        GridBagConstraints c=new GridBagConstraints();
        c.anchor=GridBagConstraints.EAST;
        int numLabels=label.length;

        for(int i=0;i<numLabels;i++){
        c.gridwidth=GridBagConstraints.RELATIVE;//next-to-last;
        c.fill=GridBagConstraints.NONE;//reset to default;
        c.weightx=0.0;//reset to default;
        container.add(label[i],c);

        c.gridwidth=GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        c.weightx=1.0;//if the value is 0 the component receive no extra space;
        container.add(textField[i],c);
        }
    }

    /**
     *Creating the action performed
     */

    public void actionPerformed(ActionEvent e){


    }






    /**
     *Create the Editor Pane
     */
    private JEditorPane createEditorPane(){
        JEditorPane editorPane=new JEditorPane();


        return editorPane;
    }





    /**
     *Creating the Text Pane
     */
    private JTextPane createTextPane(){
        JTextPane textPane=new JTextPane();




        return textPane;

    }






    /**
     *Adding different styles to document
     */
    protected static void addStilesToDocument(){

    }



    /**
     *Returns an ImageIcon, or null if the path was invalid.
     */


    public void actionPerformed(ActionEvent e){

    }

    /** Create the GUI and show it.For thread safety,
     *this method should be invoked from the event dispatch
     * thread.
     */
    public static void createAndShowGUI(){

    }



//Calling the main method
public static void main(String[] args) {

//Scheduling an event  for the event dispatching thread:
//Creating and showing the application's GUI.

SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
//Turn off metal's use of bolt fonts
        UIManager.put("swing.BoldMetal",Boolean.FALSE);
        createAndShowGUI();



    }
});

}







}
