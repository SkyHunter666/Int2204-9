/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author CCNE
 */
public class Square extends Expression{
    private Expression expression;

	public Square(Expression expression) {
		this.expression = expression;
	}
	@Override
	public String toString() {
		String square = "(" + this.expression + "^2)";
		return square;
	}
	@Override
	public int evaluate() {
		return  (int)this.expression.evaluate()*(int)this.expression.evaluate();
	}
}
