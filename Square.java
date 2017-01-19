/**
 * Created by Greg on 19.01.2017.
 */
public class Square extends Shape{
    private Point a;
    private double l;
    private double area;
    private double perimetr;

    private Square() {
        super();
    }

    private Square(Point a, double l) {
        super();
        this.a = a;
        this.l = l;
        this.area =l*l;
        this.perimetr = 4*l;
    }

    public static Square getSquare(Point a, double l){
        if(l>=0 & a !=null)
            return new Square(a,l);
        return null;
    }

    @Override
    public String toString() {
        return "Square{" +
                "A(" + a.getX() +","+a.getY()+
                "), l=" + l +
                ", area=" + area +
                ", perimetr=" + perimetr +
                '}';
    }

    @Override
    public double getPerimetr() {
        return perimetr;
    }

    @Override
    public void info() {
        System.out.println(this.toString());
    }

    @Override
    public double getArea() {
        return area;
    }
}
