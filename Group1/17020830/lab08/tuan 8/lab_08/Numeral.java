/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author admin
 */
public class Numeral extends Expression{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public Numeral(){
        
    }
    public Numeral(int value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return String.format("%d", value);
    }
    
    @Override
    public int evalute(){
        return this.value;
    }
    
}
