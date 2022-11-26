import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CatchMe extends JFrame{//JFrame을 상속받는다. 
	private JButton button;// 버튼 참조 변수 
	
	public CatchMe()//생성자이다. 
	{
		this.setTitle("나 잡아봐~라! - 권지윤");//프레임의 제목을 설정한다. 
		this.setSize(300, 300);//프레임의 사이즈 설정한다. 
		this.setResizable(false);//사이즈를 고정시킨다. 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();//panel을 새로 생성한다 
		button = new JButton("Click!");//버튼을 생성한다. 
		button.addMouseListener(new myMouseEvent());//버튼에 listener를 버튼에 붙인다. -> 마우스 이벤트에 대한 핸들러이다. 
		panel.add(button);//panel에 버튼을 올린다. 
		this.add(panel);//버튼을 올린 판넬을 프레임에 올린다. 
		this.setVisible(true);
	}
	
	public class myMouseEvent extends MouseAdapter{ //inner class로 Adapter Class 상속하여 event handling을 구현함
		public void mouseEntered(MouseEvent e)//마우스가 버튼 영역에 있으면 메소드 실행
		{
			button.setLocation((int)(Math.random()*215),(int)(Math.random()*215));//랜덤위치로 이동한다. 
			System.out.println("x="+e.getX() + "\ty="+e.getY());//콘솔에 이동한 위치를 출력한다
		
		}
		public void mouseClicked(MouseEvent e)//마우스를 클릭할 때 메소드 호출된다. 
		{
			if(e.getSource() == button)
			{
				System.out.println("윽,,, 잡혔다 ㅠㅠ");//버튼을 클릭했기 때문에 다음을 콘솔에 출력한다. 
			}
			
		
		}
	}
	

}
