package HinhHoc;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
	}
	public double getSide() {
		return super.getWidth();
	}
	public double getArea() {
		return super.getArea();
	}
	public double getPerimeter() {
		return super.getPerimeter();
	}
	public String toString() {
		return "Hình vuông có chu vi: " + getPerimeter() + "\nDiện tích: " + getArea() + "\nMàu: " + super.getColor() + "\nfilled: " + super.isFilled();
	}
}
