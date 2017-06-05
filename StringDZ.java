package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ACER on 25.05.2017.
 */
public class StringDZ {
    public static void main(String []args){
        MyQueue q=new MyQueue(90); //Ролевые модели - возможности использования программы
//        q.test();

        PrintStream p=new PrintStream(System.out);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\test.txt"));
            //PrintStream p=new PrintStream(System.out);
            String str;
            while((str=br.readLine())!=null){
                String a[]=str.split(" ");
                for(int i=0;i<(a.length-1);i++)
                    if(a[i].charAt(a[i].length()-1)==a[i+1].charAt(0)){
                        p.println(a[i]+" "+a[i+1]);
                        // System.out.println(a[i]);
                    }
            }



        }
        catch(IOException ex){
            System.out.println("error");
        }
    }
}
