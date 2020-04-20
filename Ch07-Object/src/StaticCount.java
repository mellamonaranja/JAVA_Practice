
public class StaticCount {

	int c;
//	variable member or instance variable
	static int count;
//	class variable, concept of sharing
//	member of this Object as well
//	name will be StaticCount.count
	
	public StaticCount() {
		c++;
		count++;
	}
	

	
}
