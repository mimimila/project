package DZlists;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ACER on 31.05.2017.
 */
public class DZ8 {
    public static void  main(String [] args){
        Stack<Object> s1=new Stack<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        Stack<Object>s2=new Stack<>();
        s2.add("one");
        s2.add("two");
        s2.add("three");
        s2.add("four");
        ArrayList<Object>arr=new ArrayList<>();
        ArrayList<Object>arr2=new ArrayList<>();
        Object ob=null;
        for(int i= s1.size();i>0;i--){
           // while(!s1.empty()){
            ob=s1.pop();
            arr.add(ob);
            arr2.add(s2.pop());

        }
        for(int i=arr.size()-1;i>=0;i--){
            s1.push(arr2.get(i));
            s2.push(arr.get(i));
        }

        for(int i=0;i<s1.size();i++){
            System.out.print(s1.get(i));}
            System.out.println();
       System.out.print(s2);
           // System.out.println(s1.get(i));
        }


    }

