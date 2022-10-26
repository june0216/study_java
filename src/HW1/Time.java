
public class Time {
	private int hour;
	private int minute;
	

	
	public Time() {}//기본 생성자이다. 
	
	
	private boolean isValid(int hour, int minute)//hour와 minute의 값의 범위에 맞는지 확인해주는 메서드이다.
	{
		if(hour >= 0 && hour <= 23) {//입력된 시간은 0~23 사이의 값이면서 동시에  
			if(minute >= 0 && minute <= 59)//입력된 분은 0~59 사이의 값이어야 true이다. 
			{
				return true;
			}
		}
		return false;//hour 조건 혹은 minute 조건을 하나라도 만족하지 않으면 false 반환한다. 
	}
	
	public void setTime(int hour, int minute)//hour와 minute의 범위에 벗어나지 않는다면 값을 대입한다. (멤버 변수는 범위가 정해져있어서 이 범위에 맞는 입력값만 대입될 수 있다)
	{
		if(isValid(hour, minute))//범위에 맞는지 확인한다. 맞으면 true를 반환하므로 if 조건에 성립할 것이다
		{
			this.hour = hour;
			this.minute = minute;
		}
		else
		{
			System.out.println("Wrong Input");//hour 혹은 minute의 범위에 벗어났기 때문에 값에 대입하지 않고 다음의 문장을 출력한다. 
		}
	}
	
	public int getHourOrMinute(char ch)//hour 혹은 minute의 값을 알아내기 위한 함수이다.(private이므로 외부에서 값을 알 수 없음으로 public 메서드를 통해 값을 알 수 있게 한다) 
	{
		if(ch =='H' || ch == 'h'){//h또는 H일 떄 hour를 반환한다. 
			return hour;
			
		}
		else if(ch == 'M' || ch == 'm')//m또는 M일 때 minute를 반환한다. 
		{
			return minute;
		}
		else//위의 조건을 만족하지 않는 경우 처리할 수 있는 입력값이 아니다.
		{
			return -1; //잘못된 값을 입력했기 때문에 hour와 minute의 값이 될 수 없는 -1을 반환함
		}
	}
	

}
