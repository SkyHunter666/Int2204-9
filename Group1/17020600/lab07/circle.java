/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author pc
 */
public class circle extends shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean sameCircle(circle c) {// 2 hinh tron giong nhau hay khong
		
		if(x == c.x && y == c.y && radius == c.radius) {
			return true;
		}
		return false;
    }
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap ban kinh hinh tron ");
        setRadius(super.scan.nextDouble());
	}
    @Override
    public void output() {	
        System.out.println("hinh tron");
        super.output();
        System.out.println("Ban kinh la: " + radius);
	}
}
