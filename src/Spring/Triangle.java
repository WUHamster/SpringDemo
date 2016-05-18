package Spring;

/**
 * Created by WUHamster on 17.05.2016.
 */
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        System.out.println("PointA equals: " + getPointA().getX() + ";" + getPointA().getY());
        System.out.println("PointB equals: " + getPointB().getX() + ";" + getPointB().getY());
        System.out.println("PointC equals: " + getPointC().getX() + ";" + getPointC().getY());
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
}
