
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	public JButton buttonPlus;//연산자들마다 다르게 작동해야 하므로 버튼 변수를 만들어 구분한다. 
	public JButton buttonMinus;//뺄셈에 대한 버튼이다 
	public JButton buttonMul;//곱하기에 대한 버튼이다. 
	public JButton buttonDiv;//나누기에 대한 변수이다. 
	public JButton buttonNew;//new 버튼이다. 
	public JButton buttonR;//=을 누르는 버튼이다.
	
	public String op = "+"; //연산자를 저장할 변수 -> 더하기로 초기화 -> 만약 num2를 입력하지 않고 "2="이라고 했을 때 결과로 "2 = 2"가 나오게 설정하려고 기본값으로+로 두었다. 
	//num2를 입력하지 않으면 기본값이 0이기 때문에 내부적으로 2+0=2가 되므로 "2="를 입력했을 때 결과로 2를 출력할 수 있게 한 것이다. ("2=" 2이다)
	public int num1;//계산할 정수 저장
	public int num2;// 계산할 정수
	
	
	JTextField textField;//textField를 저장할 변수이다. 
	JButton[] buttonNum;//숫자 버튼들끼리 배열을 이루어 저장하기 위한 변수이다. 
	
	public boolean isFirst = true; //첫번째 숫자인지 검사하는 변수 
	
	
	public Calculator()//생성자이다. 
	{
		setTitle("Calculator");//타이틀 설정
		setSize(300, 200);//사이즈 설정
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼을 누르면 프로그램 종료까지 된다. 
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 


		
		JPanel panelN = new JPanel();//BorderLayout에서 NORTH부분 panel
		textField = new JTextField(25);//textfield이다. 입력칸이 적당한 입력칸 크기로 만들어주기 위해 컬럼 길이를 주었다.
		textField.setHorizontalAlignment(JTextField.RIGHT); //Textfield에 데이터 입력 시 결과창은 오른쪽 정렬이다.
		panelN.add(textField); //panel에 component를 올린다. 
		add(panelN,BorderLayout.NORTH); //component를 올린 panelN을 NORTH sector로. 

		
		JPanel panelC = new JPanel();//BorderLayout의 CENTER 부분 panel이다. 
		panelC.setLayout(new GridLayout(0,4)); //LayoutManager 사용 - GridLayout, 버튼이 (0, 4)격자이다. 
		
		//makeButton 메서드 호출하여 버튼 생성한다. 
	
		buttonNum = new JButton[10];//숫자 0~9까지 총 10개를 저장할 배열을 생성한다. 
		//makeButton함수를 호출하는데 숫자에 대한 버튼을 만들고 리스너를 붙이고 판넬에 올린다. 
		buttonNum[7] = makeButton("7",panelC); //7 숫자 버튼을 만든다. 
		buttonNum[8] = makeButton("8",panelC); //8 숫자 버튼
		buttonNum[9] = makeButton("9",panelC); //9숫자 버튼 
		buttonDiv = makeButton("/",panelC);//나누기에 대한 버튼이다. 

		
		buttonNum[4] = makeButton("4",panelC); //4 숫자 버튼을 만든다. 
		buttonNum[5] = makeButton("5",panelC); //5 숫자 버튼을 만든다. 
		buttonNum[6] = makeButton("6",panelC); //6 숫자 버튼을 만든다. 
		buttonMul = makeButton("*",panelC);//곱하기에 대한 버튼이다. 

		
		buttonNum[1] = makeButton("1",panelC); //1 숫자 버튼을 만든다. 
		buttonNum[2] = makeButton("2",panelC); //2 숫자 버튼을 만든다. 
		buttonNum[3] = makeButton("3",panelC); //3 숫자 버튼을 만든다. 
		buttonMinus = makeButton("-",panelC);//빼기에 대한 버튼이다. 

		
		buttonNew = makeButton("New",panelC); //new 버튼이다. 

		buttonNum[0] = makeButton("0",panelC); //0 숫자 버튼을 만든다. 
		buttonR = makeButton("=",panelC); //계산 결과를 출력할 버튼이다. 

		
		buttonPlus = makeButton("+",panelC);//더하기 버튼이다. 
		
		add(panelC,BorderLayout.CENTER); //component를 올린 panelC를 CENTER sector에 add한다. 
		
		setVisible(true);//화면에 나타나게 한다. 
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
		for(int i = 0; i < 10; i++) {//어떤 버튼을 눌렀는지 찾아본다. 
			if(e.getSource()==buttonNum[i]){//버튼을 누른 버튼을 찾은 경우 
				textField.setText(Integer.toString(i));//버튼에 해당하는 숫자와 인덱스가 같으므로 그 숫자를 textField에 넣는다.
				if(isFirst == true)//만약 처음 입력한 숫자라면 num1에 저장한다. 
				{
					num1 = Integer.parseInt(textField.getText());//textField에 있는 string을 읽어와서 정수로 변환
					isFirst = false;
				}
				else {//처음 나온 숫자가 아니면 2번째 나온 숫자이므로 num2에 저장한다. 
					num2 = Integer.parseInt(textField.getText());
				}
			}
			
		}
		
		if(e.getSource()== buttonPlus) { // 더하기 버튼을 누른 경우 
			op = "+"; //더하기 연산자를 저장한다. 
		}
		else if(e.getSource()== buttonMinus) {//빼기 버튼을 누른 경우 
			op = "-"; //빼기라고 저장한다. 
		}
		else if(e.getSource()== buttonMul) {// 곱하기 버튼을 누른 경우 
			op = "*"; //곱셈이라고 저장한다. 
		}
		else if(e.getSource()== buttonDiv) {//나누기 버튼을 누른 경우 
			op = "/"; //연산자 종류를 "plus"라고 저장
		}

		else if(e.getSource()== buttonR) {// =의 버튼을 누르면 결과를 보여준다.
			if (op.equals("+")) {//더하기 연산일 때를 계산한다. 
				textField.setText(Integer.toString(num1 + num2));
				num1 = 0;//초기화 (new를 통해서 초기화를 하지만 new를 안눌렀을 때를 대비하여 계산한 완료 후 눈에 보이지 않는 변수만 내부적으로 초기화해준다.)
				num2 = 0;
				op = "+";
				isFirst = true;
			}
			else if (op.equals("-")) {//빼기 연산일 때를 계산한다. 
				textField.setText(Integer.toString(num1 - num2));
				num1 = 0;//초기화 
				num2 = 0;
				op = "+";
				isFirst = true;
			}
			else if (op.equals("*")) {//곱하기 연산일 때를 계산한다. 
				textField.setText(Integer.toString(num1 * num2));
				num1 = 0;//초기화 
				num2 = 0;
				op = "+";
				isFirst = true;
			}
			else if (op.equals("/")) {//나누기 연산일 때를 계산한다.
				if(num2 != 0)//나누는 수가 0이 되면 안 된다. 
				{
					textField.setText(Double.toString((double)num1 / num2));
				}
				else
				{
					textField.setText("0으로 나눌 수 없습니다.");
				}
				num1 = 0;//초기화 
				num2 = 0;
				op = "+";
				isFirst = true;
				
			}

		}
		
		else if(e.getSource()==buttonNew){
			num1 = 0;//새로 시작하는 것이므로 0으로 초기화한다. 
			num2 = 0;
			op = "+";
			textField.setText(""); //textfield 내용 지운다. 
			isFirst = true;
		}
		}
		catch(Exception ex) {//string -> int 혹은 int -> String 에 문제가 있는 등의 예외가 발생할 때 콘솔에 예외 내용을 출력한다. 
			System.out.println(ex.getMessage());
		}
	}
	
	public JButton makeButton(String text, JPanel panel )//버튼 생성 메소드 
	{
		JButton button = new JButton(text);//text를 가지고 버튼을 생성한다. 
		button.addActionListener(this);//버튼에 리스너를 붙인다. 
		panel.add(button);//해당 panel에 add한다. 
		return button;
	}


}
