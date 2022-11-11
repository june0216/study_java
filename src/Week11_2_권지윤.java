import java.util.*;

public class Week11_2_권지윤 {

	public static void main(String[] args) {
		System.out.println("===================");
		System.out.println("전공 : 기독교학과");
		System.out.println("학번 : 1989001");
		System.out.println("이름 : 권지윤");
		System.out.println("===================");
		
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> student = new HashMap<String, String>(); //HashMap을 통해 학생 ID와 이름을 쌍으로 저장한다. 
		String ID;
		String name;
		String str;
		System.out.println("학생의 ID와 이름을 차례로 입력하세요.(종료시 0 0 입력)");
		while(true){
			ID = sc.next(); //ID를 입력받는다. (ID는 띄어쓰기가 없으므로 next로 입력받음)
			name = sc.next();//name을 입력받는다. (이름에 띄어쓰기가 없다는 것을 가정)
			if (ID.equals("0")&&name.equals("0"))
			{
				break; //0 0 입력하면 정보 입력을 종료한다. 
			}
			student.put(ID,name); //put을 통해 각각의 값을 넣는다. 
		}
		
		Set s = student.keySet(); //keySet을 생성하여 키의 값만 뽑는다. 
		Iterator<String> it1 = s.iterator(); //Iterator를 사용하여 ID하나를 가져온다 
		str = it1.next(); //ID하나를 가져와서 초기값을 세팅한다. 
		int maxLength = student.get(str).length();//이름 하나를 가지고 그 길이를 maxLength로 지정
		int minLength = student.get(str).length();//이름 하나를 가지고 그 길이를 minLength로 지정
		String maxID = str;//하나를 읽어올 때 그 ID를 저장한다. 
		String minID = str;
		
		Iterator<String> it2 = s.iterator(); //Iterator it2 생성하여 이제 매번 각 이름의 길이를 비교하여 가장 길고, 가장 짧은 이름의 길이를 가진 것을 업데이트한다. 
		System.out.println("<학생명단>");
		System.out.println("[ID]			[NAME]");
		while(it2.hasNext()) {
			str=it2.next();//key를 저장
			if (maxLength < student.get(str).length()) //현재 가장 긴 이름과 지금 순서의 키의 값(이름)을 가져와서 이름의 길이를 비교 
			{
				maxLength=student.get(str).length();//반복하면서 현재 가장 긴 이름을 저장한다. 
				maxID=str;//그 이름을 가진 ID도 저장한다.
			} 
			if (minLength > student.get(str).length()) {//현재 가장 짧은 이름과 현재 순서인 키의 값(이름)의 길이를 비교 
				minLength=student.get(str).length(); //반복하면서 현재 가장 짧은 이름을 저장한다. 
				minID=str;//그 이름을 가진 ID도 저장한다. 
			}
			System.out.println(str+"\t\t"+student.get(str));//반복문을 통해 전체 학생의 명단을 출력한다. 
		}
		
		
		System.out.println("\n전체 학생수:"+student.size());//전체 쌍의 개수를 알 수 있다. 
		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:"+maxID+" Name:"+student.get(maxID)+" 길이:"+maxLength);//가장 긴 이름을 가진 ID과 그 이름을 출력
		System.out.println("<가장 짧은 이름을 가진 학생>");
		System.out.println("ID:"+minID+" Name:"+student.get(minID)+" 길이:"+minLength);//가장 짧은 이름을 가진 ID과 그 이름을 출력

	}

}
