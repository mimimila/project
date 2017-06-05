import java.security.Key;
import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

/**
 * Created by ACER on 25.05.2017.
 */
public class DZmap2 {
    Map<Integer,Integer> H=new HashMap<>();
    DZmap2(Map<Integer,Integer>H){
        this.H=H;
    }
     void count(){
         Map<Integer,Integer>arr=new HashMap<Integer, Integer>();

         int k=1;
         for(int j=1;j<=H.size();j++) {
             for (int i =0; i <=H.size(); i++) {
                 if (H.get(j) == H.get(i)&&i!=j)
                     k++;
             }
             arr.put(H.get(j),k);
            System.out.println(H.get(j) + " " + k);
             k=1;
         }
         System.out.println(arr.toString());
         for(Map.Entry<Integer,Integer>it:arr.entrySet())
         System.out.println(it.getKey()+" "+it.getValue());

    }
    public static void main(String [] args){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,5);
        DZmap2 a=new DZmap2(map);
        a.count();
    }
}
