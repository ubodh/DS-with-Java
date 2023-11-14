package GUIs;
import javax.swing.*;

public class MyFrame extends JFrame {
   public MyFrame() {
      setTitle("Addition"); // set the title of the frame
      setSize(400, 300); // set the size of the frame
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application when the frame is closed
      
      // create labels and text fields for input
      JLabel num1Label = new JLabel("Enter first number:");
      JLabel num2Label = new JLabel("Enter second number:");
      JTextField num1Field = new JTextField(10);
      JTextField num2Field = new JTextField(10);
      
      // create a label for displaying the result
      JLabel resultLabel = new JLabel("Result:");
      
      // create a button for performing the addition
      JButton addButton = new JButton("Add");
      addButton.addActionListener(e -> {
         int num1 = Integer.parseInt(num1Field.getText());
         int num2 = Integer.parseInt(num2Field.getText());
         int result = num1 + num2;
         resultLabel.setText("Result: " + result);
      });
      
//      // add an action listener to the button
//      addButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//            int num1 = Integer.parseInt(textField1.getText());
//            int num2 = Integer.parseInt(textField2.getText());
//            int sum = num1 + num2;
//            resultLabel.setText("Result: " + sum);
//         }
//      });
      
      // add the components to the content pane
      getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
      getContentPane().add(num1Label);
      getContentPane().add(num1Field);
      getContentPane().add(num2Label);
      getContentPane().add(num2Field);
      getContentPane().add(addButton);
      getContentPane().add(resultLabel);
   }
   
   public static void main(String[] args) {
      MyFrame frame = new MyFrame();
      frame.setVisible(true); // make the frame visible
   }
}
