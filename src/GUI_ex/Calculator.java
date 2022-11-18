package GUI_ex;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	public Calculator()//생성자이다. 
	{
		setTitle("Calculator");//타이틀 설정
		setSize(300, 200);//사이즈 설정 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼을 누르면 프로그램 종료까지 된다. 
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 

		
		JPanel panelN = new JPanel();//BorderLayout에서 NORTH부분 panel
		JTextField textField = new JTextField(30);//textfield이다. 입력칸이 적당한 입력칸 크기로 만들어주기 위해 컬럼 길이를 주었다.
		textField.setHorizontalAlignment(JTextField.RIGHT); //Textfield에 데이터 입력 시 결과창은 오른쪽 정렬이다.
		panelN.add(textField); //panel에 component를 올린다. 
		add(panelN,BorderLayout.NORTH); //component를 올린 panelN을 NORTH sector로. 

		
		JPanel panelC = new JPanel();//BorderLayout의 CENTER 부분 panel이다. 
		panelC.setLayout(new GridLayout(5,4)); //LayoutManager 사용 - GridLayout, 버튼이 (5, 4)격자임-고정된 숫자이다
		
		//makeButton 메서드 호출하여 버튼 생성한다. 
		makeButton("ON",panelC); //예제에 있는 계산기 모양처럼 버튼 20개를 생성한다. 그리고 panel에 add한다. 
		makeButton("AC",panelC); 
		makeButton("C",panelC); 
		makeButton("OFF",panelC);
		makeButton("7",panelC); 
		makeButton("8",panelC); 
		makeButton("9",panelC); 
		makeButton("/",panelC);
		makeButton("4",panelC); 
		makeButton("5",panelC); 
		makeButton("6",panelC); 
		makeButton("X",panelC);
		makeButton("1",panelC); 
		makeButton("2",panelC); 
		makeButton("3",panelC); 
		makeButton("-",panelC);
		makeButton("0",panelC); 
		makeButton(".",panelC); 
		makeButton("=",panelC); 
		makeButton("+",panelC);
		add(panelC,BorderLayout.CENTER); //component를 올린 panelC를 CENTER sector에 add한다. 
		
		pack();
		setVisible(true);//화면에 나타나게 한다. 
	}
	
	public void makeButton(String text, JPanel panel )//버튼 생성 메소드 
	{
		JButton button = new JButton(text);//text를 가지고 버튼을 생성한다. 
		panel.add(button);//해당 panel에 add한다. 
	}

}
