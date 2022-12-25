package ExceptionHandling_ex;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class MyCar extends JFrame implements ActionListener{
	
	Color carColor = Color.red;//처음에는 빨간색
	JRadioButton R;//색깔 라디오 버튼 - 레드
	JRadioButton G;//색깔 선택 라디오 버튼 - 그린
	JRadioButton B;//색깔 선택 라디오 버튼 - 블루
	JButton button;
	
	
	public MyCar()//생성자이다. 
	{
		this.setTitle("MyCar - 권지윤");//타이들을 설정한다. 
		Toolkit tk = getToolkit();//컴포넌트를 그리는 tool의 집합을 사용한다. 
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;//화면의 총 높이의 길이 
		int screenWidth = d.width;//화면의 총 세로의 길이 
		this.setSize(500, 350);//프레임의 크기는 다음과 같이 설정한다.
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);//정중앙에 위치하도록 한다. 
		 
		
		Car car = new Car();//자동차 판넬 생성(inner class)
		add(car, "Center");//프레임 위에 올린다. (가운데)
		
		JPanel panel2 = new JPanel();//하단에 있는 라디오와 버튼을 담기 위한 판넬을 생성한다. 
		R = new JRadioButton("RED", true);//초기 상태는 red가 선택되어 있도록 한다. 
		G = new JRadioButton("GREEN");
		B = new JRadioButton("BLUE");
		panel2.add(R);//panel에 버튼을 add한다. 
		panel2.add(G);
		panel2.add(B);
		
		ButtonGroup color = new ButtonGroup();//기능적으로 묶음을 만든다. 라디오 버튼이 세 개 중 하나만 선택될 수 있도록 묶는다.  
		color.add(R);
		color.add(G);
		color.add(B);
				
		button = new JButton("Paint");//색을 칠하는 버튼을 생성한다. 
		panel2.add(button);//버튼을 판넬에 올린다. 
		
		button.addActionListener(this);// 버튼을 누르면 이벤트가 발생하기 때문에 listener를 버튼에 붙인다. 
		add(panel2,"South"); //Frame에 판넬을 올린다. 위치는 아래에 위치하도록 명시한다 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public class Car extends JPanel{//자동차를 만들 판넬이다. 
		public void paint(Graphics g)
		{
			g.setColor(carColor);//기본으로는 빨간색이지만 사용자 선택에 따라 달라질 것이다. 
			g.fillRect(180, 50, 140, 60);//차의 위쪽 사각형이다. (상단 사각형)
			g.fillRect(110, 110, 280, 100);//차의 하단의 사각형이다. 
			
			g.setColor(Color.LIGHT_GRAY);//계속 라이트 그레이 색이다. 
			g.fillOval(150, 180, 70, 70);//바퀴이다. 
			g.fillOval(270, 180, 70, 70);
			
			g.setColor(Color.black);//계속 검정색으로 고정이다. 
			g.drawArc(270, 70, 50, 100, 30, 120);
			
			
		}
		
	}
	
	public void actionPerformed(ActionEvent e) { //event handling
		if(R.isSelected())
		{
			carColor = Color.red; //R을 선택하면 carColor는 red
		}
		else if (G.isSelected())
		{	carColor = Color.green; //G을 선택하면 carColor => green
		}
	    else if (B.isSelected())
	    {	carColor = Color.blue; //B을 선택하면 carColor => blue
	    }
	    repaint(); //repaint를 통해 다시 그리게 한다. (즉 다시 색칠하게 하는 효과를 얻을 수 있다) -> paint 함수 호출 효과 
	}
	
	
	
	

}
