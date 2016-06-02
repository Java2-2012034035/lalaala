package 계산기;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		button.setText("마침내 버틴이 눌렸다!");
	}
}
class MyFrame1 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame1(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
	    JPanel panel = new JPanel();
	    button = new JButton("눌러");
	    label = new JLabel("안눌렸네?");
	    button.addActionListener(new MyListener());
	    panel.add(button);
	    panel.add(label);
	    this.add(panel);
	    this.setVisible(true);
	
	}
}


public class ActionEventTest1 {
public static void main(String[] args){
	MyFrame1 t = new MyFrame1();
}
}
