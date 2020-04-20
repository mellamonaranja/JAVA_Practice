package com.inter2;

interface UpperCasePrintable{
//	purpose why put able is marker
}

class NamePrinter{
	public static void print(Object obj) {
//		every class is inherited by object implicitly
		String str=obj.toString();
		
		if(obj instanceof UpperCasePrintable) {
			str=str.toUpperCase();
//			function change the character from lower case letter to upper with using toUpperCase
		}
		System.out.println(str);
	}
}

class NameOne implements UpperCasePrintable{
		private String name;
		public NameOne(String name) {
			this.name=name;
		}
		
		@Override
		public String toString() {
			String strname=("your name is " + name);
			return strname;
		}
}

class NameTwo{
	
	private String name;
	public NameTwo(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		String strname=("your name is " + name);
		return strname;
	
}

public static class InterfaceEx05 {

	public static void main(String[] args) {
		NameOne name1=new NameOne("steve");
		NameTwo name2=new NameTwo("jessica");
		NameOne name3=new NameOne("alice");
		NameTwo name4=new NameTwo("bob");
		String name5=new String("codedragon");
		
//		String.valueOf();
		NamePrinter.print(name1);
		NamePrinter.print(name2);
		NamePrinter.print(name3);
		NamePrinter.print(name4);
		NamePrinter.print(name5);
//		name5 isn't belong to UpperCasePrintable therefore it prints lower letter
		NamePrinter.print(new NameOne("Code"));
		
//		UpperCasePrintable name6=new NameTwo("Dragon");
//		cannot create new object because it is the object of NameTwo which isn't realized from UpperCasePrintable
		UpperCasePrintable name7=new NameOne("Dragon");

		
	}

}
}
