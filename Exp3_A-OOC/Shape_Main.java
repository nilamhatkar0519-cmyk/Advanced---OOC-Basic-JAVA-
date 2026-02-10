abstract class Shape{

	double dim1, dim2;
	Shape(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	abstract double area();
}

class Rectangle extends Shape{

	Rectangle(double length, double breadth){
		super(length, breadth);
	}
	double area(){
		return dim1 * dim2;
	}
}

class Tringle extends Shape{

	Tringle(double base, double height){
		super(base, height);
	}
	double area(){
		return 0.5*dim1*dim2;
	}
}

class Shape_Main{
	public static void main( String[] args){
		Rectangle r = new Rectangle(10,5);
		Tringle t = new Tringle( 6,4);

		System.out.println("Rectangle Area : " +r.area());
		System.out.println("Tringle Area : " +t.area());
	}
}