package liskov_substitution_principle.violation;

public class Rectangle {
    protected int width, height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
