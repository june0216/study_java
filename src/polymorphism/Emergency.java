package polymorphism;

class Emergency {
	public Car emgList[] = new Car[10];//Car 타입의 인스턴스들을 수집할 리스트이다. 
	int index;//emgList에 실제 저장된 값의 마지막 위치를 알기 위해 선언했다. 
	
	public void EM_Call(Car car)
	{
		System.out.println("Call " + car.getNumber());//매개변수로 받은 car 인스턴스의 멤버 변수인 number를 알아내기 위해 
		//getNumber를 호출하여 private으로 된 number 변수의 값을 알 수 있게 했다. 그리고 이를 출력한다. 
		emgList[index++] = car;//index변수는 멤버 변수이므로 처음의 값이 0이다. 
		//그래서 하나씩 car타입의 인스턴스가 대입될 때마다 순서대로 증가하며 list에 대입한다. 
		
	}
	public void EM_record()
	{
		System.out.println("Emergency		Number		Car_Type		Required");
		for(int i = 0 ; i < index; i++)//emgList 배열의 각 요소들(각 인스턴스)의 멤버 변수의 정보들을 출력하기 위해  for 문을 통해 알아낸다. 
		{//이 때, 리스트에 실제 값이 들어간 마지막 위치까지 출력하기 위해 for 문의 범위를 index까지로 한다. (index는 리스트에 인스턴스 값을 저장한 마지막 위치)
			System.out.println(emgList[i].getStr());
		}
	}

}
