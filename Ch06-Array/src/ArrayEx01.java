
public class ArrayEx01 {

	public static void main(String[] args) {
		char ch0;
		char ch1;
		char ch2;
		char ch3;
		
		ch0 = 'J';
		ch1 = 'A';
		ch2 = 'V';
		ch3 = 'A';
				
				
		char[] ch;
//character형을 ch라고 선언해줌, 하나의 이름을 사용하고 있는 중
		ch = new char[4];
//		ch배열 생성, 크기가 4인 char형 공간이 만들어짐, 여기에 접근할 수 있는 메모리 주소는 char에 저장했음
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
//		각 공간에 값을 넣어줌으로써 배열을 초기화해줌
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		System.out.println(ch);
//		문자형일때만(ch일때만) 안에 있는 데이터를 이와 같이 확인 가능함
		
		for(int i=0;i<4;i++) {
//			배열은 0번부터 시작되므로, 배열의  마지막 크기보다 -1값을 넣어주거나, <4하거나
			System.out.print("배열" + i + "번째 index: ");
			System.out.println(ch[i]);
		}
		
		int arr[] = new int[7];
		
		char[] ch5 = new char[] {'h','e','l','l','o'};
//		[]안에 숫자 크기를 안 넣어줘도 됨. 왜냐면 {}안에 5개의 캐릭터가 들어가있기 때문에 []가 5개인 것을 알고 있음
//		new char[] 를 생략할 수도 있음
		char[] ch6 = {'자','바'};
//		{}로 선언과 동시에 new char[] 가 생략됨
//		따로 선언은 안 됨 
//		ex)char[] ch6; <--이렇게 각각 선언은 불가능
//		ch6={'자','바'};<--이렇게 각각 선언은 불가능
		
		
	}

}
