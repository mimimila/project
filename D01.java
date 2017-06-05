package D;

import java.io.*;

/**
 * Created by ACER on 25.05.2017.
 */
public class D01 {
    public   static void method1(){
        double arr[][]=new double[2][361];
        try
                (PrintWriter fl = new PrintWriter("C:\\sin.txt");
                 BufferedWriter bf=new BufferedWriter(fl);
                 BufferedReader br=new BufferedReader(new FileReader("C:\\sin.txt")))
        {
            for(int i=0;i<=360;i++) {
                bf.write(i+" " + Math.sin(i)+" ");
                bf.newLine();
            }
            // BufferedReader br=new BufferedReader(new FileReader("C:\\sin.txt"));

        }
        catch(IOException ex){

        }
    }}


