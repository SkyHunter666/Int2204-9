package com.company;

public class Addition implements BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }
}
