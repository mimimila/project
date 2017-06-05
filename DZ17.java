package DZlists;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ACER on 31.05.2017.
 */
public class DZ17 {
    public static void main(String [] args){// public
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(-1);
        arr.add(2);
        arr.add(3);
        arr.add(-4);
        arr.add(-5);
        arr.add(-9);
        arr.add(6);
        arr.add(9);
        arr.add(-8);
        int x=0;
        int z=0;
        Iterator it=arr.iterator();
        for(int i=0;i<arr.size();i++)
        if(arr.get(i)<0) {
            x = arr.get(i);
            arr.remove(arr.get(i));
            //arr.add(i,arr.get(i+1));
            arr.add(arr.size()+z,x);
            //z++;
        }
        System.out.println(arr);
    }
}
