package HW2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class InputFrame extends JFrame implements ActionListener{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	HashMap<String, Student> hm = new HashMap<String, Student>(); //HashMap을 통해 학생 ID와 이름을 쌍으로 저장한다. 
	JButton buttonR;//result 버튼 변수
	JButton buttonC;//cancel 버튼 변수 
	JButton buttonS;//save 버튼 변수
	JTextField fieldId;//id textField변수 
	JTextField fieldName;//name textField변수 
	JTextField fieldDept;//dept textField변수 
	JRadioButton male;//라디오 버튼 변수 
	JRadioButton female;
	
	
	
	public InputFrame()//생성자이다. 
	{
		setTitle("New Student");
		setSize(300, 200);
		
		//과제의 조건에는 없지만 편의를 위해 창을 화면 중간에 놓았다. 
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;//화면의 총 높이의 길이 
		int screenWidth = d.width;//화면의 총 세로의 길이
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);//정중앙에 위치하도록 한다. 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼을 누르면 프로그램 종료까지 된다. 
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 
		
		//NORTH에 들어갈 판넬1이다. 
		JPanel panel1 = new JPanel();//BorderLayout에서 제목부분 panel.
		makeLabel("New Student",panel1); //makeLabel 메서드를 정의하고 이를 호출해서 label 생성
		add(panel1,BorderLayout.NORTH); //component를 올린 panelN을 NORTH sector로. 
		
		
		//CENTER에 들어갈 판넬2이다. 
		JPanel panel2 = new JPanel();//panel2를 생성한다. 
		panel2.setLayout(new GridLayout(4,2));//LayoutManager 사용 - GridLayout
		
		makeLabel("ID",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		fieldId = makeTextField(panel2);//TextField를 만들어 판넬에 올리는 메소드 호출 
		
		makeLabel("NAME",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		fieldName = makeTextField(panel2);//TextField를 생성하여 판넬에 올리는 메소드 호출
		
		makeLabel("GENDER",panel2);//label을 생성하여 판넬에 올리는 메소드 호출

		JPanel panel3 = new JPanel();//라디오 버튼을 올릴 판넬 3이다. 
		male = new JRadioButton("M");
		female = new JRadioButton("F", true);//초기 상태는 Female이 되도록 한다. 
		panel3.add(male);//panel에 add한다. 
		panel3.add(female);
		
		ButtonGroup gender = new ButtonGroup();//기능적으로 묶음을 만든다. male과 female은 따로 따로 컴포넌트이다. 
		gender.add(male);
		gender.add(female);
		
		panel2.add(panel3);//라디오 판넬을 올린다. 
		
		
		
		makeLabel("DEPT",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		fieldDept = makeTextField(panel2);//TextField를 만들어 판넬에 올리는 메소드 호출 
		
		add(panel2,BorderLayout.CENTER);//component를 올린 panel2를 CENTER sector에 add
		
		//페이지의 맨아래에 들어갈 판넬 4이다. 
		JPanel panel4 = new JPanel();
		buttonS = makeButton("Save", panel4);//버튼을 생성하여 판넬에 올리는 메소드 호출
		buttonC  = makeButton("Cancel", panel4);
		buttonR = makeButton("Result", panel4);
		buttonS.addActionListener(this);
		buttonC.addActionListener(this);
		buttonR.addActionListener(this);
		add(panel4, BorderLayout.PAGE_END);// 맨아래의 영역에 판넬을 add한다. 
		

		setVisible(true);//화면에 보이게 한다. 
	}
		

		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == buttonS) {//save버튼을 눌렀을 때
						String id = fieldId.getText();//보통 id는 숫자라고 생각이 들지만,과제에 id에 대한 정의가 없으므로 어떤 값이든 들어올 수 있다고 가정한다. 
						String name = fieldName.getText();
						String dept = fieldDept.getText();
						
						int g = 1;//라디오 버튼은 기본적으로 1인 female이다. 
						if(male.isSelected())//만약 male이 선택된다면 0이다. 
						{
							g = 0;
						}
						else//female선택하는 경우 
						{
							g = 1;
						}
						//입력값이 올바른지 확인하는 부분이다. 
						if(!(id.equals("")||(name.equals("") || dept.equals(""))))//하나의 칸이라도 값이 없이 save를 누른다면 저장하지 않는다. 
						{//모든 값이 다 있어야 한다. 왜냐하면 값을 보여줄 때 GridLayout(0, 4) 방식이므로 보여주는데 해당 열(ID, NAME, GENDER,DEPARTMENT)에 대응되지 않는 위치에 값이 존재할 수 있기 떄문이다. 
							//예를 들어 열의 위치는 NAME인데 그 위치에 ID값이 들어가 보일 수 있기 때문이다. 
							Student stu = new Student(id, name, g ,dept);//입력받은 값을 통해 student객체를 만든다. 
							hm.put(stu.id, stu); //put을 통해 각각의 값을 저장한다. 
						}

						fieldId.setText("");     //값이 다 지워지고 공백이 들어감
						fieldName.setText("");
						fieldDept.setText("");
						female.setSelected(true);//초기에 female로 둘 것임 

					
				}
				else if(e.getSource() == buttonC) {//cancel 버튼을 눌렀을 때 
					fieldId.setText("");     //값이 지워지고 공백이 들어감
					fieldName.setText("");
					fieldDept.setText("");
					female.setSelected(true);//초기에 female로 둘 것임 
			        
				}
				else if(e.getSource() == buttonR)//result 버튼을 눌렀을 때
				{
					
					OutFrame outFrame = new OutFrame(hm);//생성자를 호출하면서 인자로 hashmap을 보낸다.
					fieldId.setText("");//값이 지워지고 공백이 들어감(각 버튼 이후 항상 초기화면 상태로 보여주기)
					fieldName.setText("");
					fieldDept.setText("");
					female.setSelected(true);//초기에 female로 둘 것임 
				}
			
		}

	
	
	public void makeLabel(String text, JPanel panel) {//label을 만드는 것을 반복적이므로 따로 메소드로 뺐다. 
		JLabel label = new JLabel(text);//Label을 만들고 panel에 올린다. 
		panel.add(label);
	}

	public JTextField makeTextField(JPanel panel) {//Text필드도 여러 개이므로 따로 메소드로 만들었다. 
			JTextField field = new JTextField();//TextField를 만들고 panel에 올린다. 
			panel.add(field);
			return field;
	}
	
	public JButton makeButton(String text, JPanel panel )//버튼 생성 메소드 
	{
		JButton button = new JButton(text);//text를 가지고 버튼을 생성한다. 
		panel.add(button);//해당 panel에 add한다. 
		return button;
	}




}