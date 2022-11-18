package GUI_ex;
import javax.swing.*;
import java.awt.*;

public class StudentInfo extends JFrame{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	public StudentInfo()//생성자이다. 
	{
		setTitle("Student Information");
		setSize(350, 200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼을 누르면 프로그램 종료까지 된다. 
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 
		
		//NORTH에 들어갈 판넬1이다. 
		JPanel panel1 = new JPanel();//BorderLayout에서 제목부분 panel.
		makeLabel("STUDENT INFORMATION",panel1); //makeLabel 메서드를 정의하고 이를 호출해서 label 생성
		add(panel1,BorderLayout.NORTH); //component를 올린 panelN을 NORTH sector로. 
		
		
		//CENTER에 들어갈 판넬2이다. 
		JPanel panel2 = new JPanel();//panel2를 생성한다. 
		panel2.setLayout(new GridLayout(4,2));//LayoutManager 사용 - GridLayout
		makeLabel("NAME",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		makeTextField(panel2);//TextField를 생성하여 판넬에 올리는 메소드 호출
		
		makeLabel("GENDER",panel2);//label을 생성하여 판넬에 올리는 메소드 호출

		JPanel panel3 = new JPanel();//라디오 버튼을 올릴 판넬 3이다. 
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female", true);//초기 상태는 Female이 되도록 한다. 
		panel3.add(male);//panel에 add한다. 
		panel3.add(female);
		ButtonGroup gender = new ButtonGroup();//기능적으로 묶음을 만든다. male과 female은 따로 따로 컴포넌트이다. 
		gender.add(male);
		gender.add(female);
		
		panel2.add(panel3);//라디오 판넬을 올린다. 
		
		makeLabel("ID",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		makeTextField(panel2);//TextField를 만들어 판넬에 올리는 메소드 호출 
		
		makeLabel("DEPARTMENT",panel2);//label을 생성하여 판넬에 올리는 메소드 호출
		makeTextField(panel2);//TextField를 만들어 판넬에 올리는 메소드 호출 
		
		add(panel2,BorderLayout.CENTER);//component를 올린 panel2를 CENTER sector에 add
		
		//페이지의 맨아래에 들어갈 판넬 4이다. 
		JPanel panel4 = new JPanel();
		makeButton("Save", panel4);//버튼을 생성하여 판넬에 올리는 메소드 호출
		makeButton("Cancel", panel4);
		add(panel4, BorderLayout.PAGE_END);// 맨아래의 영역에 판넬을 add한다. 
		
		
		pack();
		setVisible(true);//화면에 보이게 한다. 

	}
	
	public void makeLabel(String text, JPanel panel) {//label을 만드는 것을 반복적이므로 따로 메소드로 뺐다. 
		JLabel label = new JLabel(text);//Label을 만들고 panel에 올린다. 
		panel.add(label);
	}

	public void makeTextField(JPanel panel) {//Text필드도 여러 개이므로 따로 메소드로 만들었다. 
			JTextField field = new JTextField();//TextField를 만들고 panel에 올린다. 
			panel.add(field);
	}
	
	public void makeButton(String text, JPanel panel )//버튼 생성 메소드 
	{
		JButton button = new JButton(text);//text를 가지고 버튼을 생성한다. 
		panel.add(button);//해당 panel에 add한다. 
	}



}
