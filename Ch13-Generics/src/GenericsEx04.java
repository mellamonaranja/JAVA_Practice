

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade){
		this.grade=grade;
//		create the constructor and initialized int at the same time
	}
}

class StudentPerson{
	public StudentInfo info;
//	create the object StudentInfo 
	StudentPerson(StudentInfo info){
		this.info=info;
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position=position;
	}
	
}

class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){
		this.info=info;
	}
}


public class GenericsEx04 {

	public static void main(String[] args) {
		StudentInfo studentinfo=new StudentInfo (10);
		StudentPerson studentperson=new StudentPerson(studentinfo);
		
		System.out.println(studentperson.info.grade);
		
		EmployeeInfo employeeinfo=new EmployeeInfo(2019);
		EmployeePerson employeeperson=new EmployeePerson(employeeinfo);
		
		System.out.println(employeeperson.info.position);
		
		
		

	}

}
