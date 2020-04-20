
class MyGenerics<T>{
//	declare generic class
//	declare T as a string type
//	every T means String
//	the name of generic class is MyGenerics<T>
//  confirm the type when create the object below	
	
	private T element;
	
	public void setElement(T data) {
		element=data;
	}
	
	public T getElement() {
		return element;
	}
}

public class GenericsEx02 {

	public static void main(String[] args) {
		MyGenerics<String> mygeneric1=new MyGenerics<String>();
//		<T> was declared String type when create the object here
		mygeneric1.setElement("1000");
		System.out.println(mygeneric1.getElement());

//		MyGenerics<int> mygeneric2=new MyGenerics<String>();
//		generic type only allows only object type
		
		MyGenerics<Integer> mygeneric2=new MyGenerics<Integer>();
//		change the basic int to reference material, need to change from int to Integer
//		Integer type is allowed to object type but int
		
		Integer data=2019;
//		auto boxing has been occurred when 2019 store in data
		mygeneric2.setElement(2019);
		System.out.println(mygeneric2.getElement());
//		when call the getElement(), auto un-boxing has been occurred
		
	}

}
