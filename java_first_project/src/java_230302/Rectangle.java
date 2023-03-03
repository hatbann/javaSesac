package java_230302;

public class Rectangle {
	private int width;
	private int height;
	
	public static int count = 0;
	

	
	public Rectangle(int width) {
		this.width = width;
	}
	
	
	//getter & setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeigt(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	
	

	public int area() {
		return this.width * this.height;
	}
}
