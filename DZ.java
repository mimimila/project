import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * Created by ACER on 25.05.2017.
 */
public class DZ {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\java.txt")))
        {
            String text="v lesy";
            System.out.println("vvedite tekst");
            String str;
            str=br.readLine();
            String str1=  str.replace(text,"");
            String str2=str.replaceFirst("ona","oooooo");
            String[]a=str.split(" ");
            for(int i=0;i<a.length;i++){
                if(a[i].charAt(0)=='a'||a[i].charAt(0)=='e'||a[i].charAt(0)=='i'||a[i].charAt(0)=='o'||a[i].charAt(0)=='u'||a[i].charAt(0)=='y');{
                    System.out.println(a[i].charAt(0));
                    String A=String.valueOf(a[i]);
                    bw.write(A);
                } }
            System.out.println(str1);
            System.out.println(str2);
            bw.write(str1);
            bw.close();
        }
        catch(Exception ex){

        }
    }
}
