import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by ACER on 25.05.2017.
 */
public class FilesDZ {
    public static void main(String args[]){
        String str="";
        try{ while(!(str.equals("esc"))){
            System.out.println("vvedite imya faila ili esc dlya vihoda");
            Scanner sc=new Scanner(System.in);
            if(sc.hasNextLine())
                str=sc.nextLine();
            if(!(str.equals("esc"))){
                BufferedReader br=new BufferedReader(new FileReader(str));}
            else  System.out.println("end");
            break;
        }

        }

        catch(FileNotFoundException ex){
            System.out.println(str);
            ex.printStackTrace();

        }

    }
}
