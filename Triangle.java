/**
 * Created by Greg on 18.01.2017.
 */
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private double perimetr;
    private double area;



    private Triangle() {
    }

    private Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        double lengthA = lenght(a,b);
        double lengthB = lenght(b,c);
        double lengthC = lenght(c,a);
        perimetr = lengthA + lengthB + lengthC;
        double p = perimetr / 2;
        area = Math.sqrt((p - lengthA) * (p - lengthB) * (p - lengthC) * p);

    }
    public static Triangle getTriangle(Point a, Point b, Point c){

        double lengthA = lenght(a,b);
        double lengthB = lenght(b,c);
        double lengthC = lenght(c,a);
        if((lengthA+lengthB)>lengthC & (lengthB+lengthC)>lengthA & (lengthC+lengthA)>lengthB) {
            return new Triangle(a,b,c);
        }else{
            return null;
        }
    }

    private static double lenght(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
    }

    @Override
    public double getPerimetr() {
        return perimetr;
    }

    @Override
    public double getArea() {
        return area;
    }
    @Override
    public void info(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "A(" + a.getX() +","+a.getY()+
                "), B(" + b.getX() +","+b.getY()+
                "), C(" + c.getX() +","+c.getY()+
                "), perimetr=" + perimetr +
                ", area=" + area +
                '}';
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
