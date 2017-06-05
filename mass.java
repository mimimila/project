package D;

/**
 * Created by ACER on 25.05.2017.
 */
import java.io.Serializable;

/**
 * Created by Acer on 05.05.2017.
 */
public class mass implements Serializable { //класс для сериализации
    double Arr[];
    mass(double Arr[]){
        this.Arr=Arr;
    }
    mass(){}
    void show(){
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }
}
