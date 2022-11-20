package GUI;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame7 extends JFrame {
	public MyFrame7()
	{
		setTitle("BoxLayOutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel, "Button1");//g함수를 호출하여 버튼 생성 후 판넬에 올림 
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		makeButton(panel, "Button1");
		add(panel);
		pack();
		setVisible(true);
		
	}



	public void makeButton(JPanel p, String text)
	{
	JButton b = new JButton(text);
	b.setAlignmentX(CENTER_ALIGNMENT);
	p.add(b);
	}
}
