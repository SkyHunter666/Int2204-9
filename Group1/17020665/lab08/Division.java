public class Division extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        return String.format("(%s / %s)",left, right);
    }

    @Override
    public int evaluate(){
        return left.evaluate() / right.evaluate();
    }
}
