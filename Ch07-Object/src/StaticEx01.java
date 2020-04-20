
public class StaticEx01 {

	public static void main(String[] args) {
		
		StaticCount sc1=new StaticCount();
		System.out.println(sc1.c);
		System.out.println(StaticCount.count);
//		suggested
		System.out.println(sc1.count);
//		don't suggested
		
		StaticCount sc2=new StaticCount();
		System.out.println(sc2.c);
		System.out.println(StaticCount.count);
		
		StaticCount sc3=new StaticCount();
		System.out.println(sc3.c);
		System.out.println(StaticCount.count);
		
//		variable static has sharing concept so once it created, it executed at once. 
//		therefore the result of StaticCount.count is creating newly when an object is created.
		
	}

}
