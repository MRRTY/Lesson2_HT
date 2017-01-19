/**
 * Created by Greg on 18.01.2017.
 */
public class Main {
    public static void main(String args[]){
        Shape[] sps = new Shape[4];
        sps[0] = Triangle.getTriangle(new Point(1,0),new Point(0,0),new Point(0,1));
        sps[1] = Round.getRound(new Point(0,0),5);
        sps[2] = Square.getSquare(new Point(0,0),4);
        sps[3] = Square.getSquare(new Point(1,1),6);
        Board b = Board.getBoard(sps);
        b.info();
    }
}
