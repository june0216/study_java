package GUI;

import javax.swing.*;
import java.awt.*;

public class RadioButtonFrame extends JFrame{
	private JTextField textField;
	private JRadioButton RB1;
	private JRadioButton RB2;
	private JRadioButton RB3;
	private JRadioButton RB4;
	
	public RadioButtonFrame()
	{
		super("RadioButton Test");//JFrame 생성자 호출
		setLayout( new FlowLayout() );//awt 패키지 안에 있음 
		textField = new JTextField("Radio Button Example", 25);//25는 col값이다. 
		add(textField); //프레임에 바로 add하는 것이다. 
		RB1 = new JRadioButton("RB1");
		RB2 = new JRadioButton("RB2");
		RB3 = new JRadioButton("RB3");
		RB4 = new JRadioButton("RB4");
		add(RB1);
		add(RB2);
		add(RB3);
		add(RB4);
		ButtonGroup bg = new ButtonGroup();//기능적인 묶음이다. -> 단지 기능적으로 묶음이지, 같은 묶음에 있어도 다른 컴포넌트이다. 
		bg.add(RB1);
		bg.add(RB2);
		bg.add(RB3);
		bg.add(RB4);
		
		
		
	}
	

}
