package prototype;

public class Line implements Prototype, Shape {
    private Point startPt;
    private Point endPt;

    public Line() {
    }

    public Line(Point startPt, Point endPt) {
        this.startPt = startPt;
        this.endPt = endPt;
    }

    public Point getStartPt() {
        return startPt;
    }

    public Line setStartPt(Point startPt) {
        this.startPt = startPt;
        return this;
    }

    public Point getEndPt() {
        return endPt;
    }

    public Line setEndPt(Point endPt) {
        this.endPt = endPt;
        return this;
    }

    @Override
    public Object copy() {
        Line newLine = new Line();
        newLine.setStartPt((Point) this.getStartPt().copy());
        newLine.setEndPt((Point) this.getEndPt().copy());
        return newLine;
    }

    @Override
    public String draw() {
        return "Line : (" + startPt.draw() + " " + endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        startPt.moveOffset(dx, dy);
        endPt.moveOffset(dx, dy);
    }
}
