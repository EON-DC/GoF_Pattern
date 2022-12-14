package prototype;

public class Point implements Shape, Prototype {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    @Override
    public Object copy() {
        Point newPoint = new Point();
        newPoint.setX(this.x);
        newPoint.setY(this.y);
        return newPoint;
    }

    @Override
    public String draw() {
        return "(" + x + " " + y+ ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }
}
