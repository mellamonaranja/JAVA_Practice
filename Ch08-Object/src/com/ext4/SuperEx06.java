package com.ext4;

class Point{
	
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String getLocation() {
		return ("x" + x + "y" + y);
	}
}

class Point3D extends Point{
	int z;
	
	public Point3D() {
		
	}
	
	public Point3D(int x, int y, int z) {
//		this.x=x;
//		this.y=y;
//		upper way or call to super constructor
		super(x,y);
		this.z=z;
	}
	
	@Override
	public String getLocation() {
		return ("x:" + x + "y:" + y + "z:" + z);
		
	}
}

public class SuperEx06 {

	public static void main(String[] args) {
		Point3D point = new Point3D(1,2,3);
		point.getLocation();
		System.out.println(point.getLocation());

		

	}

}
