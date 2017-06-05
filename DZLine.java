package collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ACER on 25.05.2017.
 */
public class DZLine {

    LinkedList<Integer> a;
    DZLine(LinkedList<Integer> a){
        this.a=a;
    }
    void addnew(int x){
        a.add(x);
        System.out.println(a);
    }
    static void deletenew(LinkedList<Integer> b,int y){
        b.remove(y);
        System.out.println(b);
    }
    int length(){
        int sum=0;

        for(int i=0;i<a.size()-1;i++)
            sum=(a.get(i+1)-a.get(i))+sum;
        return sum;

    }
    static  void sort(LinkedList<DZLine> Q){
        int max=0;
        Iterator it=Q.iterator();


        for(int i=0;i<Q.size();i++){

            // while(it.hasNext()){
            if(Q.get(i).length()>max)
                max=Q.get(i).length();
            // }
            // System.out.println(max);
            //    max=0;
        }
        System.out.println(max);
        max=0;
    }
    public static void main(String [] args){

        LinkedList<Integer> A=new LinkedList<Integer>();
        DZLine L=new DZLine(A);
        Iterator it= A.iterator();
        for(int i=1;i<20;i=i+2){
            A.add(i);
        }
        System.out.println(A);
        deletenew(A,5);
        L.addnew(80);
        System.out.println(L.length());
        LinkedList<Integer>M=new LinkedList<>();
        for(int i=0;i<10;i++)
            M.add(i);
        DZLine O=new DZLine(M);
        LinkedList<DZLine>T=new LinkedList<>();
        System.out.println(O.length());
        T.add(L);
        T.add(O);
        sort(T);

    }
}
