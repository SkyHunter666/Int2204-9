/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SONY
 */
public class Shape  {
    private Color color ;
  
    public Shape(Color color) {
       this.color = color;
        
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }    
    
   public void draw(Graphics g){}
    
}
