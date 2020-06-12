package six;


class Circle {
	protected double radius = 1.0;
	protected String color = "red";
	
	Circle(){}
	Circle(double radius) { this.radius = radius;}
	Circle(double radius, String color){ this.radius = radius; this.color = color;}
	
	protected double getRadius() {
		return radius;
	}
	protected void setRadius(double radius) {
		this.radius = radius;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}



public class Pizza extends Circle {

	String type = "default";
	int size = 10;
	
	public Pizza(){
		super();
		super.setRadius(size);
	}
	public Pizza(String type, int size) {
		super();
		super.setRadius(size);
	}
	
	void print() {
		
		System.out.println("피자의 종류 : " + type + " 피자의 크기 : " + super.getArea());
		System.out.println(super.toString());
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza obj1 = new Pizza("Pepperoni", 20);
		Pizza obj2 = new Pizza();
		
		obj1.print();
		obj2.print();
		
		
	}

}
