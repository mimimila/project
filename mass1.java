package D;

import java.io.Serializable;

/**
 * Created by ACER on 25.05.2017.
 */
public class mass1 implements Serializable {

    int i;
    double arr[];
    mass1(double arr[],int i){
        this.arr=arr;
        this.i=i;
    }
    void show1(int i){
        System.out.println(arr[i]);
    }
}

