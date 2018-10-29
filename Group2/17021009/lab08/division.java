package Cau1;

public class division extends binaryExpression {
    public division( expression left, expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return this.left.toString() + "/" + this.right.toString();
    }

    @Override
    public  int evaluate() {
        return this.left.evaluate()/this.right.evaluate();
    }
}
