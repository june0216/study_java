package GUI;

import javax.swing.*;

public class MyFrame3 extends JFrame {
	public MyFrame3()
	{
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello?");
		JButton button = new JButton("BUTTON");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}

}

