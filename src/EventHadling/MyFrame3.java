package EventHadling;

import javax.swing.*;
import java.awt.event.*;

public class MyFrame3 extends JFrame implements ActionListener{
	private JButton button;
	
	public MyFrame3()
	{
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		JPanel panel = new JPanel();
		button = new JButton("Press the Button");
		button.addActionListener(this);
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button) {
			button.setText("Button Pressed");
		}
	}

}
