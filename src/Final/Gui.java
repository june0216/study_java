package Final;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class Gui extends JFrame implements ActionListener{
	Font f1, f2, f3;
	public JRadioButton r;
	public JRadioButton b;
	public JRadioButton g;
	
	public JButton bu;
	boolean isInput = false;
	
	String color = "black";
	
	public Gui()
	{
	
		
		//과제의 조건에는 없지만 편의를 위해 창을 화면 중간에 놓았다. 
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;//화면의 총 높이의 길이 
		int screenWidth = d.width;//화면의 총 세로의 길이
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);//정중앙에 위치하도록 한다. 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼을 누르면 프로그램 종료까지 된다. 
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 
 
		setSize(500, 400);
		setTitle("test");
		setLayout(new BorderLayout());
		JPanel panel3 = new JPanel();//라디오 버튼을 올릴 판넬 3이다. 
		//panel3.setLayout(new BorderLayout());//LayoutManager 사용 - GridLayout
		
		bu = new JButton("완료");
		bu.addActionListener(this);
		panel3.add(bu);
		
		JPanel panel = new JPanel();//라디오 버튼을 올릴 판넬 3이다. 
		

		r = new JRadioButton("red", true);
		
		g = new JRadioButton("green");
		
		b = new JRadioButton("blue");
		
		
		
		ButtonGroup gender = new ButtonGroup();//기능적으로 묶음을 만든다. male과 female은 따로 따로 컴포넌트이다. 
		gender.add(r);
		gender.add(g);
		gender.add(b);
		
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		
		panel.add(r);//panel에 add한다. 
		panel.add(b);//panel에 add한다.
		panel.add(g);
		
		
		/*
		 * r.addActionListener(this); b.addActionListener(this);
		 * g.addActionListener(this);
		 */
		
	
		panel3.add(panel);
		
		add(panel3 , BorderLayout.NORTH);
		add(new My(), BorderLayout.CENTER);
		
		Font f1, f2;
		f1 = new Font("Serif", Font.BOLD | Font.ITALIC , 20);
		//add(panel, BorderLayout.PAGE_END);// 맨아래의 영역에 판넬을 add한다. 
	
		setVisible(true);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		isInput = true;


		if(r.isSelected())
		{
			color = "red";
			repaint();
			System.out.println("으아");
		}
		else if(b.isSelected())
		{
			color = "blue";
			repaint();
		}
		else if(g.isSelected())
		{
			color = "green";
			repaint();
		}
		else
		{
			color = "black";
	
		}
		//repaint();
		 
	}
	public class My extends JPanel
	{
		public void paint(Graphics g)
		{
			 if(isInput == true) { 
				 if(color.equals("red")) { 
					 g.setColor(Color.red);
					 g.setColor(Color.black); 
					 g.setFont(f1); 
					 g.drawString("merry Christmas", 110,110); } 
				 else if(color.equals("blue")) { g.setColor(Color.blue);
			 g.setColor(Color.black); g.setFont(f1); g.drawString("merry Christmas", 110,
			 110); } else if(color.equals("green")) { g.setColor(Color.green);
			 g.setColor(Color.black); g.setFont(f1); g.drawString("merry Christmas", 110,
			 110); } else if(color.equals("black")) { g.setColor(Color.black);
			 g.setFont(f1); g.drawString("merry Christmas", 110, 110); } color = null;
			 isInput = false; }
			 
			
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gui();

	}

	}
