package ����;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame4() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel();
		button = new JButton("�� ��ư�� ����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾ�");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button){
					label.setText("��ħ�� ���ȴ�!");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}

	

}

public class ActionEventTest4 {
	public static void main(String[] args) {
		MyFrame4 t = new MyFrame4();
	}
}
