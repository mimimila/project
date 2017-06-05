package DZlists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ACER on 01.06.2017.
 */
public class DZ16 {
    public static void main(String [] args){
        ArrayList<String> arr=new ArrayList<>();

        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\java.txt"));
            //BufferedWriter bw =new BufferedWriter(new PrintWriter())
            String str;
            while((str=br.readLine())!=null)
                arr.add(str);
            System.out.println(arr);

            Collections.sort(arr, new Comparator<String>() { // При создании стандартного объекта класса Comparator  мы обязаны описать compare ();
                @Override
                public int compare(String o1, String o2) {// a1>2
                    if(o1.length()<o2.length())
                        return 1;
                    else
                       return -1; // нужно вернуть значение <0
                   // return  o1.compareTo(o2);// 0 -> o1>o2 , <0 -> o1>o2
                }
            });// compare <
            System.out.println(arr);

        }
        catch(Exception IO){

        }
//        void sort(ArrayList <Integer>arr){
//            for(int i=0; i<arr.size(); i++){
               // int temp=compare(arr.get(i), arr.get(i+1));
//                if(temp==0){
//                    //элементы массива обменять местами
//                }else{
                    //if (temp>0){

              //      }
//            }
//        }
    }
}
