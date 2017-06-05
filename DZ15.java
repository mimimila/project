package DZlists;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ACER on 31.05.2017.
 */
public class DZ15 {
    public static void main(String [] args){
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,2);
        m.put(1,3);
        double x=Math.pow(12,m.get(0));
        double y=Math.pow(10,m.get(1));
        double c=x+y;
        System.out.println(c);
    }
}
