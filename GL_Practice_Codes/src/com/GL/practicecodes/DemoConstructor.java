package com.GL.practicecodes;

class Constructor{
	
	double width, height, depth, length;
	
	Constructor(){
		height = depth = width = 0;
	}
	Constructor(double length){
		 height = width = depth =length  ;
	}
	Constructor(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width*height*depth;
	}
	
}

public class DemoConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c1 = new Constructor();
		System.out.println(c1.volume());
		
		Constructor c2 = new Constructor(5);
		System.out.println(c2.volume());
		
		Constructor c3 = new Constructor(2,2,6);
		System.out.println(c3.volume());
		
	}

}
