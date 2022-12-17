package HW2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NameChart extends JFrame implements ActionListener
{
	/* 전공 : 기독교학과 
	 * 학번 : 1989001
	 * 이름 : 권지윤*/
	
	int kim;//성이 나오는 수를 저장하기 위해 각 성마다 int형으로 개수를 저장할 변수
	int lee;
	int park;
	int etc;
	int total;
	JPanel pCen;//Center에 해당하는 판넬(PieChart와 각 성 및 수를 표시하고 하단의 메시지 표시)
	JPanel pSou;//South에 label, textField, button을 위한 판넬
	JButton button;
	JTextField textKim;//김씨 학생 수를 입력 받는 textField
	JTextField textLee;//이씨 학생 수를 입력 받는 textField
	JTextField textPark;//박씨 학생 수를 입력 받는 textField
	JTextField textEtc; //기타 학생 수를 입력 받는 textField
	
	String message; //오류 메시지 저장 변수 
	
	boolean valid = false;//입력값이 올바른 입력값이라는 것을 알려주는 변수 (flag역할)
	boolean isInput = false;//input값이 있다는 것을 알려주는 변수 (버튼을 눌렀다는 것을 알려준다)
	boolean isInputEx = false;//input값 숫자 형태가 아니라는 것 혹은 기타 예외에가 생겼다는 의미를 알려주는 변수이다. 
	boolean isBoundaryEx = false;//범위 밖인 예외가 발생했다는 것을 알려주는 변수
	
	//파이차트를 그릴 때 각 항목이 차지하는 각도를 의미한다. 
	int kimsize;//kim의 중심각이다. 
	int leesize;//lee의 중심각이다. 
	int parksize;//park의 중심각이다. 
	int etcsize;//etc의 중심각이다.

	public NameChart()//생성자이다. 
	{
		setTitle("Pie Chart of Student names - 권지윤");//title을 지정한다. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 끄면 프로그램이 종료되게 한다. 
		
		Toolkit tk = getToolkit();//컴포넌트를 그리는 tool의 집합을 사용한다. 
		Dimension d = tk.getScreenSize();//스크린 사이즈를 가져온다. 
		int screenHeight = d.height;//화면의 총 높이의 길이 
		int screenWidth = d.width;//화면의 총 세로의 길이 
		this.setSize(500, 400);//프레임의 크기는 다음과 같이 설정한다.
		setLayout(new BorderLayout()); //LayoutManager - BorderLayout이다. 
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);//정중앙에 위치하도록 한다.
		

		pCen = new pie();//패널 객체 생성 - 파이차트 
		add(pCen, BorderLayout.CENTER);

		pSou = new JPanel();//판넬 객체 생성
		button = new JButton("Graph"); //그래프를 만들 버튼 생성
		

		textKim = new JTextField(6);//몇명인지 입력할 텍스트 필드를 생성한다. 
		textLee = new JTextField(6);
		textPark = new JTextField(6);
		textEtc = new JTextField(6);

		pSou.add(new JLabel("Kim"));//각각 kim 텍스트를 올리고 
		pSou.add(textKim);//kim에 대한 정보를 입력할 Textfield를 올린다. 
		pSou.add(new JLabel("Lee"));//lee 텍스트를 올리고
		pSou.add(textLee);//lee 에 대한 정보를 입력할 Textfield를 올린다.
		pSou.add(new JLabel("Park"));//Park 텍스트를 올리고
		pSou.add(textPark);//park에 대한 정보를 입력할 Textfield를 올린다.
		pSou.add(new JLabel("Etc"));//Etc텍스트를 올리고
		pSou.add(textEtc);//etc에 대한 정보를 입력할 Textfield를 올린다.

		button.addActionListener(this);//버튼에 리스너를 붙인다. 
		pSou.add(button);//버튼을 판넬에 올린다. 
		
		add(pSou, BorderLayout.SOUTH);//판넬을 프레임에 올린다. 
		
		setVisible(true);
	}
	
	public class pie extends JPanel//파이차트를 만들 패널이다. 
	{
		public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0,0,500,400);//하얀색의 사각형을 그린다.  
			if(isInput == false)//버튼을 누르지 않았을 때만 표시할 부분이다. 
			{
				g.setColor(Color.blue);//색깔은 파란색으로 설정한다. 
				g.drawString("Input numbers of names(0~100).",150,280);//다음의 문장을 표현한다. 
			}
			//try는 if - elseIf - else로 구성되어 있는데 이 조건문에서 실행되는 조건들인 isBoundaryEx, inInputEx, valid 들 중 하나가 만족해야 실행되는데 이 조건들은 입력이 있는 다음에야 세팅되는 값이므로 궁극적으로 입력이 있을 때라고 할 수 있다. 
			try {
				if(isBoundaryEx == true){//input값이 있는데 전체가 범위 밖일 때
					g.setColor(Color.black);
					g.drawString(message,150,280);
					throw new OutOfBoundaryException(message);
				}
				else if(isInputEx == true) {//input값이 있는데 입력값이 숫자형태가 아닐 때와 같이 input값의 형태의 오류의 경우 
					g.setColor(Color.black);//메시지를 파란색으로 표시한다. 
					g.drawString(message,150,280);//message를 표시한다. 
					throw new Exception();//이 예외에 대한 추가 처리를 하기 위해 Exception을 발생시킨다. 
				}			
				else if(valid == true)//input값이 있으며 적합한 input값인 경우 
				{

					textKim.setText(Integer.toString(kim));//kim의 숫자를 string으로 바꾸어 화면에 표시한다. 
					textLee.setText(Integer.toString(lee));//lee의 숫자를 string으로 바꾸어 화면에 표시한다. 
					textPark.setText(Integer.toString(park));//park의 숫자를 string으로 바꾸어 화면에 표시한다. 
					textEtc.setText(Integer.toString(etc));//etc의 숫자를 string으로 바꾸어 화면에 표시한다. 
					
					g.setColor(Color.orange);//kim은 orange색이므로 이를 세팅해준다. 
					g.fillArc(150, 80, 150, 150, 0, kimsize);//kim 사이즈만큼 호를 그린다. 
				
					g.drawString("ORANGE: KIMs("+kim+")", 330, 130);//kim의 숫자를 글자로 표시한다. 
			
					g.setColor(Color.red); //lee는 red이므로 이를 세팅해준다. 
					g.fillArc(150, 80, 150, 150, kimsize, leesize); //호 그리기
				
					g.drawString("RED: LEEs("  +lee +")", 330, 150);//lee의 숫자를 글자로 표현한다. 
					

					g.setColor(Color.blue); //park은 blue이므로 이를 세팅해준다. 
					g.fillArc(150, 80, 150, 150, kimsize+leesize, parksize); //호 그리기
				
					g.drawString("BLUE: PARKs("+park+")", 330, 170);//park의 숫자를 글자로 표현한다. 
					

					g.setColor(Color.green); //기타를 나타내는 색은 green이므로 이를 세팅해준다. 
					g.fillArc(150, 80, 150, 150, kimsize+leesize+parksize, etcsize); //호 그리기
		
					g.drawString("GREEN: Etc.("+etc+")", 330, 190);//etc의 숫자를 글자로 표현한다. 
					
					g.setColor(Color.blue); //메시지를 blue색으로 설정
					g.drawString("Total number of students is "+total,150,280);//total메시지를 출력한다. 
					
					valid = false;//다 실행했으니 다시 valid값을 초기화한다. 
					isInput = false;//입력이 없는 상태로 초기화한다. 
					
				}
			
				
		
			}catch(OutOfBoundaryException ob) {
				kim = 0; //값을 0으로 초기화한다.
				lee = 0; 
				park = 0; 
				etc = 0;
				textKim.setText(""); //텍스트 필드도 초기화한다. 
				textLee.setText("");
				textPark.setText("");
				textEtc.setText("");
				
			
				message = "\0";//예외처리가 완료되었으므로 입력 상태에 대한 정보들을 다 초기화한다. 
				isBoundaryEx = false;//입력 상태 오류 정보 초기화 
				valid = false;//입력 상태 정보인 valid값을 초기화한다.
				isInput = false;//입력이 없는 상태로 초기화한다. 
			}
			catch(Exception ee) {//int형 변환과정에서 NumberFormatException의 오류와 기타 다른 잘못된 입력을 때의 예외처리를 해준다. 
				kim = 0;//값을 0으로 초기화한다. 
				lee = 0; 
				park = 0; 
				etc = 0;
				textKim.setText(""); //텍스트 필드도 초기화한다. 
				textLee.setText("");
				textPark.setText("");
				textEtc.setText("");

				message = "\0";//예외처리가 완료되었으므로 입력 상태에 대한 정보들을 다 초기화한다. 
				isInputEx = false;//입력 상태 오류 정보 초기화 
				valid = false;//입력 상태 정보인 valid값을 초기화한다. 
				isInput = false;//입력이 없는 상태로 초기화한다. 
		}
			}
	}



	

	public void actionPerformed(ActionEvent e)//ActionListener를 구현한 것이다. event handling 부분이다
	{
			if(e.getSource() == button) //사용자가 버튼을 클릭하면
			{
				isInput = true;//input값이 있다. -> 버튼을 눌렀다는 것을 의미 
				try
				{
					//사용자의 입력값을 받아 int형으로 바꾸어준다. 숫자 이외의 형식이 들어오면 Exception 발생한다. 
					kim = Integer.parseInt(textKim.getText());
					lee = Integer.parseInt(textLee.getText());
					park = Integer.parseInt(textPark.getText());
					etc = Integer.parseInt(textEtc.getText());
					
					if((kim > 100 || kim < 0) || (lee >100 || lee <0) || (park > 100 || park <0) || (etc > 100 || etc <0)) {
						throw new OutOfBoundaryException();//각 값이 0~100사이가 아니므로 범위 밖 exception을 발생시킨다. 
					}
					
					total = kim+lee+park+etc;//총 개수를 계산하여 저장한다. 
					//원그래프를 그리기 위해 먼저 각 항목이 차지하는 백분율을 구한 후, 100퍼센트는 원 그래프에서 360도 이므로 1퍼센트당 3.6으로 부채꼴의 중심각을 계산한다. 
					kimsize = (int)((double)kim/total*360.0);//파이차트에 들어갈 비율을 계산한다. 
					leesize = (int)((double)lee/total*360.0);
					parksize = (int)((double)park/total*360.0);
					etcsize = (int)((double)etc/total*360.0);
					valid = true;//이 문장이 실행되었다는 것은 int형 변환 과정에서 오류가 없었기 때문에 input값이 숫자였다는 것이며 주어진 범위 내의 숫자이므로 올바른 입력값이다. 

					repaint();//파이차트를 그린다. 

				}
				catch(OutOfBoundaryException ofb)//입력값이 범위 밖일 경우 발생하는 예외
				{
	
		            message = "Number should be 0~100.";//해당 예외에 맞는 메시지를 저장한다.(과제에서는 입력의 오류에 대한 예외를 하나의 같은 메시지로 표현하지만 나중에 메시지를 바꾸기만 하면 예외를 세분화하여 처리할 수 있다. 일단은 범위 밖인 예외만 사용자 예외처리를 시도했다)
		            isBoundaryEx = true;//범위 밖 오류 상태를 true로 한다. 
		            repaint();//결과를 화면에 그린다. 
				}
				catch(Exception ee)//int형 변환과정에서 NumberFormatException의 오류와 다른 잘못된 입력을 때의 예외처리를 해준다. 
				{
					message = "Number should be 0~100.";//해당 예외에 맞는 메시지를 저장한다. 
		            isInputEx = true;//입력 형태 오류 상태를 true로 한다. 
		            repaint();//결과 내용을 화면에 그린다. 
				}
				
			}
		}
	
	
	public class OutOfBoundaryException extends Exception{ //범위를 벗어날 때 예외처리이다. 
		OutOfBoundaryException(){//기본 생성자이다. 
		}
		OutOfBoundaryException(String message){
			super(message);
		}
	}
}