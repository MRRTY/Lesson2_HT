/**
 * Created by Greg on 19.01.2017.
 */
public class Board {
    private Shape[] shapes = new Shape[4];

    private Board() {
        super();
    }

    private Board(Shape[] shapes) {
        super();
       for(int i = 0; i  < shapes.length; i++){
           this.shapes[i] = shapes[i];
       }
       for (int i = shapes.length-1; i<3;i++){
           shapes[i] = null;
       }
    }
    public static Board getBoard(Shape[] shapes){
        for (Shape s: shapes) {
            if(s == null)
                return null;
        }
        if(shapes.length>4)
            return  null;
        return new Board(shapes);
    }
    public boolean addShape(Shape s){
        for (Shape sp: shapes) {
            if(sp == null) {
                sp = s;
                return true;
            }
        }
        return false;
    }
    public boolean deleteShape(Shape s){
        for (Shape sp: shapes) {
            if(s == sp){
                s = null;
                return true;
            }
        }
        return false;
    }
    public void info(){
        double square =  0;
        for (Shape s: shapes) {
            if(s!= null) {
                square += s.getArea();
                s.info();
            }
        }
        System.out.println("Summary Square = "+square);

    }

}
