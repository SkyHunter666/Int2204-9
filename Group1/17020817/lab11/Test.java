/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Max<Double> maxdata = new Max<>();
        for (int i = 0; i < 20; i++) {
            maxdata.add(Math.random() * 49 + 1);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Phan tu thu " + (i+1) + " la : " + maxdata.get(i));
      
            
        }
        System.out.println("Phan tu lon nhat la : " + maxdata.getMax());
        
    }
}