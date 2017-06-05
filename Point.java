package ExceptionDZ;

/**
 * Created by ACER on 25.05.2017.
 */

public class Point extends  Graph {
    String str;
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    String draw() {
        return str="Точка с координатами x= "+x+" y= "+y;
    }
    void moveTo(int x1,int y1){
        System.out.println("Координаты точки "+x1+" "+y1);
    }
    void move(int dx,int dy){
        System.out.println("Координаты точки изменены "+(x+dx)+" "+(y+dy));
    }
}
