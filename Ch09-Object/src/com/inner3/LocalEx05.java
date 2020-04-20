package com.inner3;

import com.inner3.Readable05.OuterClass05;

interface Readable05{
	public void read();
	
	class OuterClass05{
		private String myName;
		
		public OuterClass05(String name) {
			myName=name;
		}
		public Readable05 createLocalClassInst(final String instName) {
//			medium variable need to be declare with final
			class LocalClass implements Readable05{
				@Override
				public void read() {
					System.out.println("outer instance name is "+myName);
					System.out.println("inner instance name is "+instName);
				}
			}
			return new LocalClass();
		}
	}
}

public class LocalEx05 {

	public static void main(String[] args) {
		OuterClass05 outerclass05=new OuterClass05("amanda");
		Readable05 readable05=outerclass05.createLocalClassInst("edwin");
		readable05.read();
//		
		Readable05 readable06=outerclass05.createLocalClassInst("bella");
		readable06.read();
		
	}

}
