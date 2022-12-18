package HW2;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TODO: 결과창 사이즈 조절

public class OutFrame extends JFrame{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	HashMap<String, Student> st;
	JPanel panel;
	JLabel labelId;
	JLabel labelName;
	JLabel labelGen;
	JLabel labelDept;
	
	JPanel[] panelL;
	int i =0;

	
	public OutFrame()
	{
		
	}
	
	public OutFrame(HashMap<String, Student> student)
	{
		this.st = student;//input프레임에서 넘어온 학생 정보를 저장한다. 
		setTitle("Student List");
		setSize(300, 200);//윈도우 사이즈는 300, 200이다. 
		Toolkit tk = getToolkit();//과제의 조건에는 없지만 편의를 위해 화면 가운데에 창을 위치시킨다. 
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;//화면의 총 높이의 길이 
		int screenWidth = d.width;//화면의 총 세로의 길이
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);//정중앙에 위치하도록 한다.
		setLayout(new BorderLayout()); //LayoutManager 사용 - 전체 창은 BorderLayout 
		JPanel panel = new JPanel();//프레임에 판넬을 올리고 
		panel.setLayout(new GridLayout(0, 4));//LayoutManager 사용 - GridLayout 설정하기 //행, 열, 좌, 우 
		

		labelId = makeLabel("ID", panel);//기본적으로 데이터의 헤더 부분인 ID, NAME, GENDER, DEPARTMENT의 라벨을 생성 후 판넬에 붙인다. 
		labelName = makeLabel("NAME", panel);//텍스트 라벨을 만들고 판넬에 붙이는 메소드를 따로 정의하여 각각 호출해주었다. 
		labelGen = makeLabel("GENDER", panel);
		labelDept = makeLabel("DEPARTMENT", panel);
	
		Set s = st.keySet();
		Iterator<String> it = s.iterator();//iterator을 이용하여 학생 정보 모두 출력한다. 

		while(it.hasNext()) {//hashNext를 사용하여 하나씩 보여준다. 
			String key=it.next();//key를 저장
			makeLabel(st.get(key).id, panel);//반복문을 통해 전체 학생의 명단을 출력한다. 
			makeLabel(st.get(key).name, panel);//반복문을 통해 전체 학생의 명단을 출력한다.
			makeLabel(st.get(key).genderToString(st.get(key).gender), panel);//반복문을 통해 전체 학생의 명단을 출력한다.
			makeLabel(st.get(key).dept, panel);//반복문을 통해 전체 학생의 명단을 출력한다.
			i++;
		}
		add(panel,BorderLayout.CENTER); //component를 올린 panelN을 NORTH sector로.

		setVisible(true);//화면에 보이게 한다. 

	}
	
	public JLabel makeLabel(String text, JPanel panel) {//label을 만드는 것을 반복적이므로 따로 메소드로 뺐다. 
		JLabel label = new JLabel(text);//Label을 만들고 panel에 올린다. 
		panel.add(label);
		return label;
	}
	



}
