/**
 * Created by Greg on 19.01.2017.
 */
public class Round extends Shape {
    private Point center;
    private double r;
    private double perimetr;
    private double area;

    private Round() {
        super();
    }

    private Round(Point center, double r) {
        super();
        this.center = center;
        this.r = r;
        perimetr = 2*Math.PI*r;
        area = Math.PI*r*r;

    }
    public static Round getRound(Point center, double r){
        if(r>=0){
            return new Round(center,r);
        }else{
            return null;
        }
    }
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Round{" +
                "center(" + center.getX() +","+center.getY()+
                "), r=" + r +
                ", perimetr=" + perimetr +
                ", area=" + area +
                '}';
    }

    @Override
    public void info() {
        System.out.println(this.toString());
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimetr() {
        return perimetr;
    }
}
