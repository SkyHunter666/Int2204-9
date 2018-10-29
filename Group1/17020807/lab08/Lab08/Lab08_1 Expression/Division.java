/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author Dell
 */
public class Division extends BinaryExpression {
    Expression left;
    Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Division() {
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    Expression left(){
        return left;
    }

    Expression right() {
        return right; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    int evaluate(){
        return left().evaluate() / right().evaluate();
    }


    public String toString() {
        return left().toString() + " / " +right().toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
