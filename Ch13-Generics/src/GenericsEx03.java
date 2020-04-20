class GenericsEx<T>{
//	within <>, generalize the data type so any character can be put <>
	
	T[]v;
	
	public void set(T[]str) {
		v=str;
//		v is array
	}
	
	public void print() {
		for(T s:v) {
//			declare s, s is string array T 
			System.out.println("s"+s);
		}
	}
}
public class GenericsEx03 {

	public static void main(String[] args) {
		GenericsEx<String> genericsex=new GenericsEx<String>();
//		if un-declare the type with <>, it implies object type implicitly
//		then, can put various types ex)String, Integer
		
		String[] sArr= {"°¡", "³ª", "´Ù"};
		genericsex.set(sArr);
		genericsex.print();

	}

}
