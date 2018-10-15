package fruit;

public class orange extends Fruit{
    protected String origin;
    protected int type;

//    public orange(String name, String color, String shape, double weight) {
//        super(name, color, shape, weight);
//    }

    public orange(String name, String color, String shape, double weight, String origin, int type) {
        super(name, color, shape, weight);
        this.origin = origin;
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", origin='" + origin + '\'' +
                ", type=" + type;
    }
}
