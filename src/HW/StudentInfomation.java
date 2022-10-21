package HW;

public class StudentInfomation {
	private String name;
	private String id;
	
	public StudentInfomation() {} //기본 생성자이다. 
	
	public void display()//학생의 정보를 출력한다. 
	{
		System.out.println("NAME		ID");
		System.out.printf("%s		%s", name, id);
	}
	
	public String getName()//name은 private이기 때문에 외부에서 이를 정보를 알고자 한다면 get함수를 통해서 값을 읽어온다. 
	{
		return name;
	}
	public String getId()//id은 private이기 때문에 외부에서 이를 정보를 알고자 한다면 get함수를 통해서 값을 읽어온다. 
	{
		return id;
	}
	
	public void setName(String newName)//name은 private이기 때문에 외부에서 이 변수에 값을 수정하고 싶으면 set함수를 통해서만 가능하다. 
	{
		name = newName;
		
	}
	public void setId(String newId)//id는 private이기 때문에 외부에서 이 변수에 값을 수정하고 싶으면 set함수를 통해서만 가능하다. 
	{
		id = newId;
	}
	

}
