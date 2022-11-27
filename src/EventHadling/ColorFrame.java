package EventHadling;
import javax.swing.*;
import java.awt.event.*;//ActionListener
import java.awt.*; //BorderLayout

public class ColorFrame extends JFrame implements ActionListener{
	
	Color color = new Color(0, 0, 0);//검정색 -> 처음에 검정색 나옴 
	JButton button;
	
	public ColorFrame()
	{
		setTitle("Color Change Test");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();//판넬 생성
		button = new JButton("Color Change");
		button.addActionListener(this);//버튼에 이벤트 발생시킴 
		buttonPanel.add(button);
		
		add(buttonPanel, BorderLayout.NORTH);
		MyPanel p = new MyPanel();
		add(p, "Center");
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public void paint(Graphics g)
		{
			g.setColor(color);
			g.fillRect(10,0, 260, 210);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		//랜덤으로 색깔 생성
		repaint(); //paint()가 실행되도록 하려면 반드시 repaint를 호출한다. 
	}

}
