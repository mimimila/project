package collections;

import java.util.Stack;

/**
 * Created by ACER on 25.05.2017.
 */
public class DZ5 {
    public  static void main(String [] args){
        Stack<Double> q= new Stack<Double>();
        q.add(1.1);
        q.add(1.2);
        q.add(1.3);
        q.add(0.1);
        System.out.println(q);
        double max=0;
        for(int i=0;i<q.size();i++){
            if(q.get(i)>max)
                max=q.get(i);
        }
        System.out.println(max);
        q.remove(max);
        for(int i=q.size()-1;i>=1;i--)
            q.set((i),q.get(i-1));
        q.set(0,max);System.out.println(q);
    }
}


