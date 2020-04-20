package com.inter2;

interface I{
	public abstract void play();
}

class B implements I{
	@Override
	public void play(){
		System.out.println("play of B class");
	}
}

class C implements I{
	@Override
	public void play(){
		System.out.println("play of C class");
	}
}

class Z{
	public void autoPlay(I i) {
//		every objects made by interface can be put into i
		i.play();
//		play methods is common 
	}
}

public class InterfaceEx09 {

	public static void main(String[] args) {
		Z z=new Z();
		z.autoPlay(new B());
//		instead of I, can be replaced class B()
//		occured upcasting, changed the type automatically because new B is a child
		z.autoPlay(new C());

	}

}
