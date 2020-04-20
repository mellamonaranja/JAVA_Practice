public class exercise{
	
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	exercise(){
		
	}
	exercise(String model){
		this.model = model;
	}
	
	exercise(String model, String color){
		this.model = model;
		this.color =color;
	}
	
	exercise(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;	
	}
	

	public static void main(String[] args) {
		exercise car1=new exercise();
		exercise car2=new exercise("personnel");
		exercise car3=new exercise("personnel", "red");
		exercise car4=new exercise("personnel", "red", 200);

	}
	
}

