
class NoteBook extends Product{//Product를 상속 받는다. 

	NoteBook() {//NoteBook의 가격은 300이므로 이에 맞게 부모 생성자를 호출하여 생성한다. 
		super(300);
	}
	
	public String toString() //object의 toString을 자식 클래스인 NoteBook에서 오버라이딩해서 사용한 것이다. 
	{
		return "NoteBook";
	}
	

}
