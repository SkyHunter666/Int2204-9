public class Division extends BinaryExpression{

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public Expression left(){
        return super.left();
    }

    @Override
    public Expression right() {
        return super.right();
    }
    @Override
    public String toString() {
        return String.format("%s / %s", right , left);
    }

    @Override
    public int evaluate() {
        return (right.evaluate() / left.evaluate());
    }

}