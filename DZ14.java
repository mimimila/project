package DZlists;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ACER on 31.05.2017.
 */
public class DZ14 {
    public static void main(String[] args){
        Map <Integer,Integer> m=new HashMap<>();
        for(int i=0;i<10;i++)
            m.put(i,i*2);
        int y=10;
        System.out.println(m);
        int x;
        //for(int j=0;j<2;j++){
        for(int i=0;i<y;i=i+2) {
            x = m.get(i) + m.get(i + 1);
            m.put(i, x);
            m.remove(i + 1);

        }
        y=(Integer)y/2;
       // }
        System.out.println(m);
    }
}
