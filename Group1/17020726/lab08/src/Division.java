public class Division extends BinaryExpression
{

    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate()
    {
        return this.left.evaluate() / this.right.evaluate();
    }

    @Override
    public String toString()
    {
        return this.left.toString() + " / " + this.right.toString();
    }
}
