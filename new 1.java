interface Drawable(){
	double PI = 3.14;
	void draw();
	double area();
}
  class Circle implements Drawable {
	  double r ;
	  Circle(double r){this.r=r;}
	  public void draw(){
	  System.out.print("Drawing Circle");
	  }
	  public double area{
	  return PI*r*r ;}
  }
interface Resizeable(){
   void resize(double factor);
}
class Square implements Drawable,Resizeable{
	double side;
	Square(double side){
	this.side=side;}
	public void draw(){
		System.out.print("Drawing Square"):
	}
	public double area(){
		return side*side ;
	}
	public void resize(double f){
		return side*=f;
	}
}
public class Main{
	public static void main(String[] args){
		Circle circle = new Circle(2.0);
		circle.draw();
		System.out.print("Area of circle" + circle.area());
		
		Square square = new Square(3.0);
		square.draw();
		System.out.print("Area of square" + square.area());\
		
		double scalefactor=2.5;
		System.out.print("Resizing Scale factor to" + scalefactor);
		square.resize(scalefactor);
		
		square.draw();
		System.out.println("Reszed square area" + square.area());
	}
		
	
		
	