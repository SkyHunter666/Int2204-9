/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Square  extends Rectangle {
    public Square(){
        super();
    }
    public Square(toaDo A, toaDo B, toaDo C, toaDo D, String c , boolean f ){
        super(A, B, C, D, c, f);
    }
    public boolean sameSquare(Square s){
        if(super.sameRectangle(s) == true ) return true ;
        else return false ;
    }
    @Override
    public String toString(){
        return super.toString();
    }

}