package com.company;

public class Multiplication extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = (Numeral)left;
        this.right = (Numeral)right;
    }

    public String toString() {
        return left.toString() + " * " +right.toString();
    }


    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }
}