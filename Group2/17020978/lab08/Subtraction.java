package lab08;

public class Subtraction extends BinaryExpression {
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    public Expression left()
    {
        return this.left;
    }

    public Expression right()
    {
        return this.right;
    }

    @Override
    public String toString() {
        return "left: " + this.left + " right: " + this.right;
    }

    @Override
    public int evaluate() {
         return left.evaluate() - right.evaluate();
    }
}
