
public class Triangle {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle Triangle(){
		
		Triangle tri = new Triangle();
		tri.side1 = 1.0;
		tri.side2 = 1.0;
		tri.side3 = 1.0;
		return tri;
		}
	
	public Triangle Triangle(double side1,double side2,double side3){
		Triangle tri = new Triangle();
		tri.side1 = side1;
		tri.side2 = side2;
		tri.side3 = side3;
		
		return tri;
		
	}
	
	public double get_side1(){
		return side1;
	}
	public double get_side2(){
		return side2;
	}
	public double get_side3(){
		return side3;
	}
	public double getArea(){
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		double p = (a+b+c)/2;
		double set = (p*(p-a)*(p-b)*(p-c));
		double area = Math.pow(set,0.5);

		if (area == 0){
			try {
				throw new TriangleException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (set < 0){
			try {
				throw new TriangleException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return area;
	}
	
	public double getPerimeter(){
		double perim = this.side1+this.side2+this.side3;
		return perim;
	}
	public String toString(){
		String a = Double.toString(this.side1);
		String b = Double.toString(this.side2);
		String c = Double.toString(this.side3);
		String area = Double.toString(this.getArea());
		String perimeter = Double.toString(this.getPerimeter());
		String description = "The triangle description:\nSide 1: "+a+"\nSide 2: "+b+"\nSide 3: "+c+"\nArea: "+area+"\nPerimeter: "+perimeter;
		return description;
	}
	}


