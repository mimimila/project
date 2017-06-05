package ExceptionDZ;

/**
 * Created by ACER on 25.05.2017.
 */
public abstract class Mywindow implements Movable{
    int  getX(int x){
        System.out.println();
        return x;
    }
    void getY(int y){
        System.out.println(y);
    }

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Координаты изменены "+x+" "+y);
    }
}
