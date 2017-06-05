package collections;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ACER on 25.05.2017.
 */
public class DZ3 {
    public static void main(String [] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> err=new ArrayList<Integer>();
        Random r=new Random();
        for(int i=0;i<20;i++)
            arr.add(new Integer(r.nextInt()/1000000));
        arr.toString();
        System.out.println(arr);

        int max=0; int min=0; int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(arr.get(i)>max)
                max=arr.get(i);
            if(arr.get(i)<min)
                min=arr.get(i);
        }
        System.out.println("max= "+max+" min= "+min+" sum= "+sum);

        int n=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0) {
                n=arr.get(i);
                err.add(n);
            }
        }
        System.out.println(err);

        for(int i=0;i<arr.size();i++){
            if((arr.get(i)%2)!=0)
                arr.remove(i);
        }
        System.out.println(arr);

        int k=0; int d=0; int dd=0;int l=arr.size()-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                d=arr.get(i);
                arr.add(k,d);
                k++;}
            else{
                dd=arr.get(i);
                arr.add(l,dd);
                l--;
            }

        }
        System.out.println(arr);


        int m=-100000000;
        for(int j=arr.size()-1;j>=0;j--) {
            for (int i = 0; i < j; i++) {
                if (arr.get(j) > m)
                    m = arr.get(j);
            }
            arr.set(j, m);
            m=-10000000;
        }
        //System.out.println(arr);

        boolean a=arr.contains(-1000000);
        // System.out.println(a);


    }
}
