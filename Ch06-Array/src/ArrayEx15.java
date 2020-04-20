import java.util.Arrays;
public class ArrayEx15 {

	public static void main(String[] args) {
		String[] myclass = {
				"강남규", "박인호", "윤주현", "김윤지", "신승혜",
				"김태현", "이인한", "이종혁", "임주혜", "김호윤",
				"고도희", "강민기", "권희연", "이세영", "전승운",
				"김서홍", "유현지", "하유리", "김성우", "박민서",
				"이광수"
		};
		
		System.out.println(Arrays.toString(myclass));
		
		Arrays.sort(myclass);
		System.out.println(Arrays.toString(myclass));
	}

}
