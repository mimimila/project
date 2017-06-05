package DZlists;

import java.util.Stack;

/**
 * Created by ACER on 31.05.2017.
 */

public class DZ6 {
    public static void main(String [] args){
        String str="34*56++";
        int c=0;
        int x=0;
        int y=0;
        Stack<Integer>s=new Stack<>();
        char[]a=str.toCharArray();
        for(int j=0;j<a.length;j++){

           // int g=Character.getNumericValue(a[j]);
             //s.add(g);}
            //for(int j=0;j<s.size();j++){
            if (a[j] == '1' || a[j] == '2' || a[j] == '3' || a[j] == '4' || a[j] == '5' || a[j] == '6' || a[j] == '7' || a[j] == '8'
                    || a[j] == '9' || a[j] == '0'){
            int g=Character.getNumericValue(a[j]);
                s.add(g);
               }
           // System.out.println(s);
            else {
                //for(int k=0;k<s.size();k++)
                if (a[j] == '+') {
                    x = s.peek();
                    System.out.println(s);
                    s.pop();
                    System.out.println(s);
                    y = s.peek();
                    s.pop();
                    c = (x + y);
                    s.push(c);
                    System.out.println(s);
                }
                if (a[j] == '-')
                    c = a[j - 1] - a[j - 2];
                if (a[j] == '*'){
                    x = s.peek();
                System.out.println(s);
                s.pop();
                System.out.println(s);
                y = s.peek();
                s.pop();
                c = (x * y);
                s.push(c);}
                if (a[j] == '/')
                    c = a[j - 2] / a[j - 1];



        }}
        System.out.print(s);
    }
}
