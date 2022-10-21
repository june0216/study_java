import java.util.Scanner;

public class Week8_1_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		int menu;//사용자가 입력할 작업 번호를 저장할 변수 
		int num= 0; //AbstractPet 참조변수 배열 인덱스 관리 
		int species;
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기 위해 Scanner 클래스를 사용함
		
		AbstractPet Pet[] = new AbstractPet[10];//참조변수 배열을 선언(여러 자손 클래스 인스턴스를 저장하기 위해 조상 클래스 타입으로 배열을 선언)		
		
		while(true)
		{
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input  2. Output  3.Exit");
			menu = sc.nextInt();//사용자가 원하는 작업의 번호를 숫자로 입력 받아 저장한다. 
			if(menu == 1)//1을 입력했다면 배열의 요소가 추가되는 것이다. 
			{
				System.out.println("종은 무엇입니까?");//배열의 요소 인스턴스를 만들기 위해 원하는 자식 클래스 타입을 골라야 한다. 즉, 원하는 종을 골라야 한다. 
				System.out.println("1. Dog  2. Cat  3. Snake  4. Bird");
				species = sc.nextInt();//사용자에게 원하는 종에 해당하는 번호를 입력 받는다. 
				if(species == 1)//1이라면 dog에 해당하는 것이므로 이에 대한 것이다. 
				{
					Pet[num] = new Dog(); // Dog에 해당한 인스턴스 생성한다. 

				}
				
				if(species == 2)//2라면 Cat에 해당하는 것이다. 
				{
					Pet[num] = new Cat();//Cat에 해당하는 인스턴스를 생성한다. 

				}
				if(species == 3) //3이라면 Snake에 해당하는 것이다. 
				{
					Pet[num] = new Snake(); //Snake에 인스턴스를 생성한다. 

				}
				if(species == 4)//4이라면 Bird에 해당하는 것이다. 
				{
					Pet[num] = new Bird();//Bird에 해당하는 인스턴스를 생성한다. 

				}
				sc.nextLine();//위에서 사용했던 nextInt에서 엔터 전까지 숫자만 읽어오기 때문에 엔터가 남아있어서 name을 입력받아야 하는 부분에서 
				//엔터가 입력이 되어 없어질 수 있다. 
				System.out.print("Name:"); 
				Pet[num].name = sc.nextLine(); //사용자에게 이름을 입력받는다. 이름을 String이므로 nextLine으로 입력받는다.  
				System.out.print("Age:");
				Pet[num].age = sc.nextInt(); //나이를 입력받는다. 나이는 int이므로 nextInt로 입력 받는다. 
				
				num++;
				
				
			}
			else if(menu == 2)//메뉴 선택지 2번이라면 그 동안 입력했던 Pet을 모두 출력하는 것이므로 출력을 진행한다. 
			{
				System.out.println("");//간격을 위해 넣었다 
				System.out.printf("%s		%s		%s		%s", "Species", "Name", "Age", "movement");//간격을 맞추기 위해 서식을 지정하여 출력하는 printf 방식을 선택
				System.out.println("");
				
				for(int i = 0 ; i < num; i++)
				{
					System.out.printf("%-1s		%-1s		%d		", Pet[i].species, Pet[i].name, Pet[i].age);//간격을 맞추기 위해 서식을 지정하여 출력하는 printf 방식을 선택
					//왼쪽 정렬을 위헤 -1을 사용한다. 
					Pet[i].move();//movement 출력한다.
				}
			}
			
			else if(menu == 3)//menu가 3이면 반복문을 종료한다. 
			{
				System.out.println("종료");
				break;//반복문 종료한다. 
			}
			else//메뉴에 없는 1, 2, 3을 입력할 경우 잘못된 입력이라고 출력한다. 
			{
				System.out.println("잘못된 입력입니다. ");
			}
			System.out.println("");
			
			
		}

	}

}
