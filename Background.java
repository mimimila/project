package ExceptionDZ;

/**
 * Created by ACER on 25.05.2017.
 */
public class Background extends Graph{
    String color;
    String str;
    Background(String color){
        this.color=color;
    }
    String draw() {
        return str="Цвет "+color;
    }
}
