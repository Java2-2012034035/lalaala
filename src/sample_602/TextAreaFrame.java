package sample_602;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener {
  protected JTextField textField;
  protected JTextArea texArea;
  
  public TextAreaFrame(){
	  
	  
	  setTitle("Text Area Test");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  textField = new JTextField(30);
	  textField.addActionListener(this);
	  
	  texArea = new JTextArea(10,30);
	  JScrollPane scrollpane = new JScrollPane(texArea);
	  texArea.setEditable(false);
	  
	
	  add(textField, BorderLayout.NORTH);
	  
	  add(scrollpane,BorderLayout.CENTER);
	  //add(texArea, BorderLayout.CENTER);
	  pack();
	  setVisible(true);
  }
 

public void actionPerformed(ActionEvent evt){
	 String textg = textField.getText();
	 texArea.append(textg + "\n");
	 textField.selectAll();
	 texArea.setCaretPosition(texArea.getDocument().getLength());
 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new TextAreaFrame();
	}

}
