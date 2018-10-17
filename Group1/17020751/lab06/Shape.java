package tuan6;
public abstract class Shape {
    String color = "red";
    private boolean filled = true;
    Shape() {}
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // trả về màu sắc
    public String getColor() {
        return color;
    }
    // gán màu sắc
    public void setColor(String color) {
        this.color = color;
    }
    // kiểm tra filled
    public boolean isFilled() {
        return filled;
    }
    // gán filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // cài đè phương thức toString
    @Override
    public String toString() {
        if (filled == true)
            return super.toString() + "@" + color + "@filled:true";
        else
            return super.toString() + "@" + color + "@filled:false";
    }
}