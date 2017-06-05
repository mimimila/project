package DZlists;

import java.nio.charset.CharsetEncoder;

/**
 * Created by ACER on 30.05.2017.
 */
public class DZstack {
    Object[]arr;
    int first=0;
    int last=0;
    int size=0;
    DZstack(Object[]arr){
        this.arr=arr;
    }
    void pushelem(Object el){
        arr[last]=el;

        last++;
        size++;

    }
    void printt(){
        for(int i=0;i<size;i++)
            System.out.print(arr[i]);
    }
   Object   popelem(){
        Object ob=last;
        if(last>0){
            last--;
        size--;}
        return ob;
    }
    Object peekelem(){

           return last;
    }
    Boolean emptyelem(){
        return(size==0);
    }
    int searchel(Object el){
        int x=-1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==el){
             x=size-i;
            }
            return x;
    }
    public static void main(String [] args){
        String arr[]=new String[4];
       DZstack a=new DZstack(arr);

      int g=Character.getNumericValue('6');
        System.out.println(g);
//       a.pushelem("1");
//        a.pushelem("2");
//        a.pushelem("3");
//        a.pushelem("4");
//        a.printt();
//        System.out.println(a.peekelem());
//        System.out.println(a.popelem());
//        a.printt();
//        System.out.println(a.searchel("1"));
    }
}
