package EventHadling;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;//JFrame


public class MouseAdapterTest extends JFrame{
	JPanel p = new JPanel();
	JLabel myLabel;
	
	public MouseAdapterTest()
	{
		setTitle("Mouse Adapter Test");
		p.addMouseListener(new myMouseEvent());//이벤트 핸들러 생성 후 판넬에 붙이기 
		myLabel = new JLabel("Location of the mouse");
		myLabel.setSize(50, 20);
		myLabel.setLocation(30, 20);
		p.add(myLabel);
		add(p);
		
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	class myMouseEvent extends MouseAdapter{
		public void mousePressed(MouseEvent e)
		{
			int x = e.getX();
			int y = e.getY();
			myLabel.setText("x = "+ x + "y = " + y);
		}
	}
	

}
