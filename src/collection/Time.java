package collection;

public class Time {
	int hour;
	int minute;
	int second;
	
	Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toString()
	{
		return "Hour: "+hour+"\tMinute: "+minute+"\tSecond: "+second;
		
	}
}
