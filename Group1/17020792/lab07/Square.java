/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;



/**
 *
 * @author CCNE
 */
public class Square extends Rectangle {
  
            public Square(){
               
            }
            public Square(double size){
                width =size ;
                length =size ;
            }
            public Square(double size , String c , boolean f ){
                   width = size;
                   length = size;
                   color = c ;
                   filled = f;
              }
            public double getSize(){
                return this.width ;
            }
            public void setSize(double size){
                this.width = size ;
                this.length = size ;
            }
            @Override
            public void setWidth(double size){
                 this.width = size ;
            }
            @Override
            public void setLength(double size){
                 this.length = size ;
            }
            public boolean sameSquare(Square s2) {
                if (this.l1.sameLocation(s2.l1) && this.l2.sameLocation(s2.l2)
                && this.l3.sameLocation(s2.l3) && l.sameLocation(s2.l)) {
                return true;
                }

                return false;
            }
            @Override
            public String toString(){
                return "Square : " + this.getArea()+ " " + this.getPerimeter() + " " + color+" "+filled+" "+width;  
               }
}
