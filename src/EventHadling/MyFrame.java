package EventHadling;

import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame{
	private JButton button;
	
	public MyFrame()
	{
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		JPanel panel = new JPanel();
		button = new JButton("Press the Button");//버튼 인스턴스 생성
		
		button.addActionListener(new MyListener());//이벤트를 버튼에 붙인다. 
		panel.add(button);//버튼을 판넬 위에 올린다. 
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == button)
			{
				button.setText("Button Pressed");
			}
		}
	}

}
