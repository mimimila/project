package DZlists;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ACER on 29.05.2017.
 */
public class DZ2 {
    public static void main(String[] args){
        String x="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Vvedite 4islo");
        //Scanner sc=new Scanner(System.in);
        if(sc.hasNext()){

        x=sc.nextLine();}
        char[] arr=x.toCharArray();

        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<arr.length;i++)
        s.add(arr[i]);

        for(int i=s.size()-1;i>=0;i--)
        System.out.print(s.pop());
    }
}
