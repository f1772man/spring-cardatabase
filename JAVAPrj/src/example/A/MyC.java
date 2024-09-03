package example.A;

import example.Pen;

public class MyC {
	public int aa;
	int bb;
	
	public int retInt() {
		return 20;
	}
	
	public float retFloT() {
		return 20.0F;
	}
	
	public char retChar() {
		return 'a';
	}
	
	public Pen retPen() {
		return new Pen();
		
	}
	
	public void voidPen() {
		System.out.println("펜이요!");
	}

}
